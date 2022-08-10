package com.FAccount.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bankRepository extends JpaRepository<Long, Id> {

}
