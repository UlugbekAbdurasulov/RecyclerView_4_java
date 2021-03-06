package com.example.recyclerview_4_java;

public class Member {
    private String firstName;
    private String lastName;
    private boolean available;

    public Member(String firstName, String lastName, boolean available) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.available = available;
    }

    public Member(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
