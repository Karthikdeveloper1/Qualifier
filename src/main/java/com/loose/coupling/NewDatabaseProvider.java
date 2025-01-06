package com.loose.coupling;

import javax.xml.crypto.Data;

public class NewDatabaseProvider implements DataProvider {
    @Override
    public String getUserDetails() {
        return "New Database Provider";
    }
}
