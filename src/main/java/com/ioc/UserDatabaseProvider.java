package com.ioc;

public class UserDatabaseProvider implements DataProvider {
    @Override
    public String getUserDetails() {
        return "MYSQL DATABASE";
    }
}
