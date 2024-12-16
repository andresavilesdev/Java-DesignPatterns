package com.singleton;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector db = DatabaseConnector.getInstance();
        System.out.println(db);

        DatabaseConnector db2 = DatabaseConnector.getInstance();
        System.out.println(db2);


    }
}
