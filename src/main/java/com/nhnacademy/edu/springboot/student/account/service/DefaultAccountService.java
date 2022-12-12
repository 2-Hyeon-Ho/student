package com.nhnacademy.edu.springboot.student.account.service;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import com.nhnacademy.edu.springboot.student.account.domain.AccountDto;
import com.nhnacademy.edu.springboot.student.account.exception.AccountExistException;
import com.nhnacademy.edu.springboot.student.account.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefaultAccountService implements AccountService {
    private final AccountRepository accountRepository;

    public DefaultAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Account getAccount(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + "is not found"));
    }

    @Override
    @Transactional
    public void registerAccount(AccountDto account) {
        Account newAccount = new Account(account.getId(), account.getName(), account.getBalance());
        if(accountRepository.findById(account.getId()).isPresent()) {
            throw new AccountExistException(newAccount);
        }

        accountRepository.save(newAccount);
    }

    @Override
    @Transactional
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
