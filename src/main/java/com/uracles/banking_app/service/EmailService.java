package com.uracles.banking_app.service;

import com.uracles.banking_app.dto.request.EmailDetails;
import org.springframework.stereotype.Component;

@Component
public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
