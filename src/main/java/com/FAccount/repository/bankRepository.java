package com.FAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FAccount.model.Bank;

public interface bankRepository extends JpaRepository<Bank, Long> {

}
