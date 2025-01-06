package com.loose.coupling;

public class UserDatabaseProvider implements DataProvider{
    @Override
    public String getUserDetails() {
        return "MYSQL DATABASE";
    }
}
