package com.java;
import com.java.domain.Address;
import com.java.domain.Contact;
import com.java.domain.Phone;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Main");

        Employee employee = new Employee.EmployeeBuilder()
                .setAge(12)
                .setName("Andres")
                .setGender("Male")

                .setAddress(new Address("Tv 30 #18f-14","Valledupar","Colombia","20004"))
                .setAddress(new Address("Diag 18 #29-55","Valledupar","Colombia","20004"))

                .setPhone(new Phone("3137374995","+57","mobile"))
                .setPhone(new Phone("3138245969","+57","mobile"))

                .setContact(
                        new Contact("andres",
                        new Phone("3137374995","+57","mobile"),
                        new Address("Diag 18 #29-55","Valledupar","Colombia","20004"))
                )
                .build();

        System.out.println(employee);
    }
}