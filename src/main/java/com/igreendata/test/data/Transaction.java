package com.igreendata.test.data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="transaction")
public class Transaction {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String accountNo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Transient
  private String accountName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Date valueDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String sign;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private BigDecimal amount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String narrative;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public Date getValueDate() {
    return valueDate;
  }

  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

}
