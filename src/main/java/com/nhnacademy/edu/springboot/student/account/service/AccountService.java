package com.nhnacademy.edu.springboot.student.account.service;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import com.nhnacademy.edu.springboot.student.account.domain.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
    Account getAccount(Long id);
    void registerAccount(AccountDto account);
    void deleteAccount(Long id);
}
