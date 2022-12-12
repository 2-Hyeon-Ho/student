package com.nhnacademy.edu.springboot.student.account.exception;

import com.nhnacademy.edu.springboot.student.account.domain.Account;

public class AccountExistException extends RuntimeException {
    public AccountExistException(Account account) {
        super(account.getId() + "is Exist!");
    }
}
