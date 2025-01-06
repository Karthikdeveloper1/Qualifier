package com.loose.coupling;

public class LooseCouplingEx {
    public static void main(String[] args) {

        DataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerDB = new UserManager(dataProvider);
        System.out.println(userManagerDB.getUserInfo());
        //new database
        DataProvider webServiceProvider=new NewDatabaseProvider();
        UserManager userManagerDB1= new UserManager(webServiceProvider);
        System.out.println(userManagerDB1.getUserInfo());
        //mongo
        DataProvider dataProvider2=new MongoData();
        UserManager mongoData = new UserManager(dataProvider2);
        System.out.println(mongoData.getUserInfo());
    }
}
