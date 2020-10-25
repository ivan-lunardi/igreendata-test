package com.igreendata.test.constant;

import java.util.HashMap;

public class ResultCode {

  private static HashMap<String, String> resultDesc = new HashMap<String, String>();

  //Success result code
  public final static String RESULTCODE_SUCCESS = "0";

  //Fail result code
  public final static String RESULTCODE_FAIL = "1";

  static {
    //Success result description
    resultDesc.put(RESULTCODE_SUCCESS, "Success");

    //Fail result description
    resultDesc.put(RESULTCODE_FAIL, "Fail");
  }

  public static String getResultDescription(String resultCode) {
    return resultDesc.get(resultCode);
  }

}
