package com.uracles.banking_app.service.implementation;

import com.uracles.banking_app.dto.request.AppUserRequestDto;
import com.uracles.banking_app.dto.response.BankResponse;
import com.uracles.banking_app.entity.AppUser;
import com.uracles.banking_app.service.AppUserService;
import com.uracles.banking_app.utils.AccountUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Override
    public BankResponse createAccount(AppUserRequestDto userRequest) {
        //create an account, save a user to db
        AppUser newUser = AppUser.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .email(userRequest.getEmail())
                .accountBalance(BigDecimal.ZERO)
                .phoneNumber(userRequest.getPhoneNumber())
                .alternatePhoneNumber(userRequest.getAlternatePhoneNumber())
                .status("ACTIVE")

                .build();

        return null;
    }
}
