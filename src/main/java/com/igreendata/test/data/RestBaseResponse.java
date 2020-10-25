package com.igreendata.test.data;

import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Base REST Response with Common Fields")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestBaseResponse {

  @ApiModelProperty(value="Result Code", required=true, example="0")
  @JsonProperty
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String resultCode;

  @ApiModelProperty(value="Result Description", required=true, example="Success")
  @JsonProperty
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String resultDescription;

  @JsonProperty
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Data data;


  public RestBaseResponse() {
  }

  public String getResultCode() {
    return resultCode;
  }

  @XmlElement(name="resultCode")
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }
  
  public String getResultDescription() {
    return resultDescription;
  }

  @XmlElement(name="resultDescription")
  public void setResultDescription(String resultDescription) {
    this.resultDescription = resultDescription;
  }

  public Data getData() {
    return data;
  }

  @XmlElement(name="data")
  public void setData(Data data) {
    this.data = data;
  }

}
