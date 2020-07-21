package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Flight
{
    private Date departsOn;
    private List<Tickets> tickets;
    @JsonProperty("Tickets")
    public List<Tickets> getTickets() {
        return tickets;
    }
    @JsonProperty("Tickets")
    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDepartsOn() {
        return departsOn;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDepartsOn(Date departsOn) {
        this.departsOn = departsOn;
    }

}
