package com.bridgelabz.AddressBook2;

import java.util.ArrayList;

public class AddressMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program Management ");

        ArrayList<Person> list=new ArrayList<Person>();

        AddressBook addressBook = new AddressBook();
        addressBook.operation(list);
    }

}
