package com.uracles.banking_app.service;

import com.uracles.banking_app.dto.request.AppUserRequestDto;
import com.uracles.banking_app.dto.response.BankResponse;

public interface AppUserService {
    BankResponse createAccount(AppUserRequestDto requestDto);

}
