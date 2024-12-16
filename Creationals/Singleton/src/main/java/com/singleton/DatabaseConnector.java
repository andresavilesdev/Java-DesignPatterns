package com.singleton;

/**
 *  Rules:
 *  1) Debemos tener un constructor privado / We need to have an empty constructor
 *  2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 *  3) Debemos tener un metodo estatico de devuelva la instancia / We need to have a public static method wich returns the instance
 */

public class DatabaseConnector {

    private static DatabaseConnector instance;

    private DatabaseConnector() {
        System.out.println("Creating a new instance of DatabaseConnector");
    }

    public static synchronized DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public static void connectDatabase() {
        if (instance == null) {
            throw new IllegalStateException("DatabaseConnector not initialized");
        }
        System.out.println("Connecting to the database");
    }

    public void disconnectDatabase(){

        if(instance == null){
            throw new NullPointerException("The instance of DatabaseConnector is not initialized");
        }

        System.out.println("Disconnecting to Database " + instance);
    }
}
