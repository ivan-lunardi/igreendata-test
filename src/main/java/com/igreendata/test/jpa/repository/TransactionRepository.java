package com.igreendata.test.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.igreendata.test.data.Transaction;

@Repository
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {

  @Query(value="SELECT new com.igreendata.test.data.AccountTransaction(a.accountName, t AS transaction) FROM Account a, Transaction t WHERE a.accountNo = :accountNo AND t.accountNo = a.accountNo ORDER BY t.valueDate DESC")
  Page<Transaction> findByAccountNo(@Param("accountNo") String accountNo, Pageable pageable); 

}
