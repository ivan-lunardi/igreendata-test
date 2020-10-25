package com.igreendata.test.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Data {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Account> accounts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Transaction> transactions;


  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

}
