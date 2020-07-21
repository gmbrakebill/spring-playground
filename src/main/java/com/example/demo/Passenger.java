package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {

    private String firstName;
    private String lastName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }
    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
