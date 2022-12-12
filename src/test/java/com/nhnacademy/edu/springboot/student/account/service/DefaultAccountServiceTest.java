package com.nhnacademy.edu.springboot.student.account.service;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import com.nhnacademy.edu.springboot.student.account.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DefaultAccountServiceTest {

    @Autowired
    AccountService accountService;

    @Test
    void getAccounts() {
        List<Account> accounts = accountService.getAccounts();
        assertThat(accounts).hasSize(6);
    }
}