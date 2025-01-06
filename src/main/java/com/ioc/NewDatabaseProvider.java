package com.ioc;

public class NewDatabaseProvider implements DataProvider {
    @Override
    public String getUserDetails() {
        return "New Database Provider";
    }
}
