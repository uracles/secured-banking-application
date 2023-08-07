package com.uracles.banking_app.controller;

import com.uracles.banking_app.dto.request.AppUserRequestDto;
import com.uracles.banking_app.dto.response.BankResponse;
import com.uracles.banking_app.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/appUser")
public class AppUserController {


    private final AppUserService appUserService;

    @PostMapping("/register")
    public BankResponse createAccount(@RequestBody AppUserRequestDto userRequestDto){
        return appUserService.createAccount(userRequestDto);
    }

}
