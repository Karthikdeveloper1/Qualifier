package com.ioc;

public class UserManager {
    private DataProvider dataProvider;

    public UserManager(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
    public String getUserInfo(){
        return dataProvider.getUserDetails();
    }
}
