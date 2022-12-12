package com.nhnacademy.edu.springboot.student.account.repository;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void findAll() {
        //given
        Account account = new Account(1L, "lee", 10000);
        accountRepository.save(account);

        //when
        Optional<Account> actual = accountRepository.findById(1L);

        //then
        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(account);
    }
}