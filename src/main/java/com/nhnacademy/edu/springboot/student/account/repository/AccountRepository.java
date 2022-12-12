package com.nhnacademy.edu.springboot.student.account.repository;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAll();
}
