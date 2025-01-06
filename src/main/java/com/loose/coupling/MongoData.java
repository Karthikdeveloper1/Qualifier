package com.loose.coupling;

public class MongoData implements DataProvider {
    @Override
    public String getUserDetails() {
        return "Mongo Database provider";
    }
}
