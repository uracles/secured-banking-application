package com.uracles.banking_app.service.implementation;

import com.uracles.banking_app.dto.request.AppUserRequestDto;
import com.uracles.banking_app.dto.response.AccountInfo;
import com.uracles.banking_app.dto.response.BankResponse;
import com.uracles.banking_app.entity.AppUser;
import com.uracles.banking_app.repository.AppUserRepository;
import com.uracles.banking_app.service.AppUserService;
import com.uracles.banking_app.utils.AccountUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {


    private final AppUserRepository appUserRepository;
    @Override
    public BankResponse createAccount(AppUserRequestDto userRequest) {
        //check if user already has an account
        //create an account, save a user to db
        if (appUserRepository.existsByEmail(userRequest.getEmail())) {
            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_EXISTS_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
                    .accountInfo(null)
                    .build();
        } else {


            AppUser newUser = AppUser.builder()
                    .firstName(userRequest.getFirstName())
                    .lastName(userRequest.getLastName())
                    .otherName(userRequest.getOtherName())
                    .gender(userRequest.getGender())
                    .address(userRequest.getAddress())
                    .stateOfOrigin(userRequest.getStateOfOrigin())
                    .accountNumber(AccountUtils.generateAccountNumber()) //logic
                    .email(userRequest.getEmail())
                    .accountBalance(BigDecimal.ZERO) //used big decimal
                    .phoneNumber(userRequest.getPhoneNumber())
                    .alternatePhoneNumber(userRequest.getAlternatePhoneNumber())
                    .status("ACTIVE")
                    .build();

            AppUser savedAppUser = appUserRepository.save(newUser);


            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_CREATION_SUCCESS_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_CREATION_SUCCESS_MESSAGE)
                    .accountInfo(AccountInfo.builder()
                            .accountName(savedAppUser.getFirstName() + " " + savedAppUser.getLastName()
                                    + " " + savedAppUser.getOtherName())
                            .accountBalance(savedAppUser.getAccountBalance())
                            .accountNumber(savedAppUser.getAccountNumber())
                            .build())
                    .build();
        }
    }
}
