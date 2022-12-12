package com.nhnacademy.edu.springboot.student.account.controller;

import com.nhnacademy.edu.springboot.student.account.domain.Account;
import com.nhnacademy.edu.springboot.student.account.domain.AccountDto;
import com.nhnacademy.edu.springboot.student.account.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountRestController {
    private final AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @PostMapping
    public void accountRegister(@Valid @RequestBody AccountDto accountDto) {
        accountService.registerAccount(accountDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }

}
