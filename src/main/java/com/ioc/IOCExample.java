package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationIOC.xml");

        //DataProvider dataProvider = new UserDatabaseProvider();
        //UserManager userManagerDB = new UserManager(dataProvider);
        UserManager userManagerDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerDB.getUserInfo());
        //new database
//        DataProvider webServiceProvider=new NewDatabaseProvider();
//        UserManager userManagerDB1= new UserManager(webServiceProvider);
        UserManager userManagerDB1= (UserManager) context.getBean("userManagerWithNewDataProvider");
            System.out.println(userManagerDB1.getUserInfo());
        //mongo
//        DataProvider dataProvider2=new MongoData();
//        UserManager mongoData = new UserManager(dataProvider2);
        UserManager mongoData = (UserManager) context.getBean("userManagerWithMongoData");
        System.out.println(mongoData.getUserInfo());
    }
}
