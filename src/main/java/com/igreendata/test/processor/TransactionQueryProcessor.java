package com.igreendata.test.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.igreendata.test.constant.ResultCode;
import com.igreendata.test.data.Data;
import com.igreendata.test.data.RestBaseResponse;
import com.igreendata.test.data.Transaction;
import com.igreendata.test.jpa.repository.TransactionRepository;

public class TransactionQueryProcessor implements Processor {

  private static final Logger log = LoggerFactory.getLogger(TransactionQueryProcessor.class);

  @Autowired
  private TransactionRepository transactionRepository;

  protected static final Gson gson;

  protected String mappingKey;

  static {
    gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .disableHtmlEscaping()
            .create();
  }

  @Override
  public void process(Exchange exchange) throws Exception {
    log.debug("Start query transaction...");

    String pageNoStr = (String) exchange.getIn().getHeaders().get("pageNo");
    String rowCountStr = (String) exchange.getIn().getHeaders().get("rowCount");
    int pageNo = StringUtils.isBlank(pageNoStr)? 0 : Integer.parseInt(pageNoStr) - 1;
    int rowCount = StringUtils.isBlank(rowCountStr)? 10 : Integer.parseInt(rowCountStr);

    String accountNo = (String) exchange.getIn().getHeaders().get("accountNo");

    RestBaseResponse response = new RestBaseResponse();
    try {
      Page<Transaction> transactions = transactionRepository.findByAccountNo(accountNo, PageRequest.of(pageNo, rowCount));

      Data data = new Data();
      data.setTransactions(transactions.getContent());
      response.setData(data);
      response.setResultCode(ResultCode.RESULTCODE_SUCCESS);
      response.setResultDescription(ResultCode.getResultDescription(ResultCode.RESULTCODE_SUCCESS));

    } catch(Exception ex) {
      response.setResultCode(ResultCode.RESULTCODE_FAIL);
      response.setResultDescription(ResultCode.getResultDescription(ResultCode.RESULTCODE_FAIL));
      throw ex;
    }

    exchange.getIn().setBody(gson.toJson(response));
    log.debug("Finish query transaction...");
  }

}
