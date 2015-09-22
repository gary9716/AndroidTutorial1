package com.hci.lab430.model;

/**
 * Created by lab430 on 15/9/21.
 */
public class User {
    public String firstName;
    public String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

//
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//

}
