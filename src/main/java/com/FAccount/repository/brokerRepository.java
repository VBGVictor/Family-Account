package com.FAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FAccount.model.Broker;

public interface brokerRepository extends JpaRepository<Broker, Long> {

}
