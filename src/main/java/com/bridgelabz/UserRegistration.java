package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstname(String firstName) {
     /*
      UC1: Enter Valid FirstName
     */
       return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }
    public boolean validLastname(String lastName) {
     /*
      UC2: Enter Valid LastName
     */
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName);
    }
    public boolean validEmailId(String emailId) {
     /*
      UC3: Enter Valid Email-Id
     */
        return Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}",emailId);
    }
}
