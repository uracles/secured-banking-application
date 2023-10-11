package com.uracles.banking_app.service;

import com.uracles.banking_app.dto.request.AppUserRequestDto;
import com.uracles.banking_app.dto.request.EnquiryRequest;
import com.uracles.banking_app.dto.response.BankResponse;

public interface AppUserService {
    BankResponse createAccount(AppUserRequestDto requestDto);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);

}
