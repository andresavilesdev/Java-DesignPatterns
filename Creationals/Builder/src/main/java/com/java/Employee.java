package com.java;

import com.java.domain.Address;
import com.java.domain.Contact;
import com.java.domain.Phone;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee{

    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class EmployeeBuilder implements IBuilder<Employee>{

        private int age;
        private String name;
        private String gender;
        private Address address;
        private final List<Phone> phones = new ArrayList<>();
        private final List<Contact> contacts =  new ArrayList<>();

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String cp) {
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone) {
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String phoneNumber, String ext, String phoneType) {
            this.phones.add(new Phone(phoneNumber, ext, phoneType));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact) {
            this.contacts.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address) {
            this.contacts.add(new Contact(name, phone, address));
            return this;
        }


        @Override
        public Employee build() {
            return new Employee(age, name, gender, address, phones, contacts);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, age=" + age +
                "\n, name='" + name + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                "}";
    }
}
