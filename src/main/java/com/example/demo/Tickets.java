package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tickets {
   private Passenger passenger;
     private int price;

    @JsonProperty("Price")
    public int getPrice() {
        return price;
    }
    @JsonProperty("Price")
    public void setPrice(int price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
