package org.ulpgc.is1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
        if (!isValid()) {
            this.number = "XXXX";
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean isValid() {
        Pattern pattern = Pattern.compile("^[0-9]{9}$");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}