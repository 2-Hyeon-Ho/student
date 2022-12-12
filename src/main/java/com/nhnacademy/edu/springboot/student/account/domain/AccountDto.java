package com.nhnacademy.edu.springboot.student.account.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AccountDto {

    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private int balance;
}
