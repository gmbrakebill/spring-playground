package com.example.demo;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

public class Person
{
    private String firstName;
    private String lastName;
    @JsonIgnore
    private String mySecretCodez;
    private int weight;
    private String description;
    private Date departsOn;


    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDepartsOn() {
        return departsOn;
    }
    public void setDepartsOn(Date dateTime)
    { this.departsOn = dateTime; }


    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDateBorn(Date date)
    {
        return date;
    }
    @JsonGetter("weight")
    public int getWeight() {
        return weight;
    }
    @JsonSetter("WEIGHT")
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMySecretCodez() {
        return mySecretCodez;
    }

    public void setMySecretCodez(String mySecretCodez) {
        this.mySecretCodez = mySecretCodez;
    }

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
}
