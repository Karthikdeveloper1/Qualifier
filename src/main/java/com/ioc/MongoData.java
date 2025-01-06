package com.ioc;

public class MongoData implements DataProvider {
    @Override
    public String getUserDetails() {
        return "Mongo Database provider";
    }
}
