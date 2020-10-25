package com.igreendata.test.data;

import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;

@SqlResultSetMapping(name = "accountTransactionMapping", classes = {
    @ConstructorResult(targetClass = AccountTransaction.class,
                       columns = { @ColumnResult(name = "account_name"),
                                   @ColumnResult(name = "transaction")
                                 })
})
public class AccountTransaction {

  private String accountName;
  private Transaction transsaction;

  public AccountTransaction(Transaction transsaction) {
    this.transsaction = transsaction;
  }

  public AccountTransaction(String accountName, Transaction transsaction) {
    this.accountName = accountName;
    this.transsaction = transsaction;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Transaction getTransaction() {
    return transsaction;
  }

  public void setTransaction(Transaction transsaction) {
    this.transsaction = transsaction;
  }

}
