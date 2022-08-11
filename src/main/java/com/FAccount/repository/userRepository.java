package com.FAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FAccount.model.User;

public interface userRepository extends JpaRepository<User, Long> {

}
