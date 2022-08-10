package com.FAccount.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface accountRepository extends JpaRepository<Long, Id> {

}
