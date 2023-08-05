package com.uracles.banking_app.utils;

import java.time.Year;

public class AccountUtils {


    public static String generateAccountNumber(){
        //logic to generate account number
        //should start with 2023 and any random 6 digits to make it 10 digits
        //six digits = between 100000 and 999999

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randNumber = (int)Math.floor(Math.random() * (max - min) + min);
//    int randomInt = min + (int)(Math.random() * (max - min));

        //convert currentYear and randomNumber to a string and concatenate together
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);

        StringBuilder accountNum = new StringBuilder();
        return accountNum.append(year).append(randomNumber).toString();

//        return year + randomNumber;

    }
}
