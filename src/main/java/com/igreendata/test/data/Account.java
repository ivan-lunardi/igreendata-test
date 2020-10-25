package com.igreendata.test.data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="account")
public class Account {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String accountNo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String accountName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String accountType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Date balanceDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private BigDecimal openingAvailableBalance;


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

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Date getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(Date balanceDate) {
    this.balanceDate = balanceDate;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getOpeningAvailableBalance() {
    return openingAvailableBalance;
  }

  public void setOpeningAvailableBalance(BigDecimal openingAvailableBalance) {
    this.openingAvailableBalance = openingAvailableBalance;
  }

}
