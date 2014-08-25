package com.patmullins.soccerleague.model;

public class Validator {

    public String validate(String username, String password) {
        if (("patrick".equalsIgnoreCase(username))
                && ("password".equals(password))) {
            return "success";
        } else {
            return "failure";
        }
    }
}