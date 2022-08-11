package com.FAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FAccount.model.Account;

public interface accountRepository extends JpaRepository<Account, Long> {

}
