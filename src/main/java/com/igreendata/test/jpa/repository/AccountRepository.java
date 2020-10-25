package com.igreendata.test.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.igreendata.test.data.Account;

@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

  Account findByAccountNo(String accountNo);

  Page<Account> findAll(Pageable pageable); 

}
