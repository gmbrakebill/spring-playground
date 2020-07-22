package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/flights")
public class FlightsController {
    @GetMapping("/flight")
    public Flight getFlight()
    {
        Flight flight1 = new Flight();
        Passenger p1 = new Passenger();
        Tickets t1 = new Tickets();
        p1.setFirstName("Mason");
        p1.setLastName("Brakebill");
        t1.setPassenger(p1);
        t1.setPrice(220);
        flight1.setDepartsOn(new Date(2014 - 1900, 5,8));
        flight1.setTickets(Arrays.asList(t1));
        return flight1;
    }
    @GetMapping("/flights")
    public List<Flight> getFlights()
    {
        Flight flight2 = new Flight();
        Passenger p2 = new Passenger();
        Tickets t2 = new Tickets();
        p2.setFirstName("Mike");
        p2.setLastName("Lawry");
        t2.setPassenger(p2);
        t2.setPrice(100);
        flight2.setDepartsOn(new Date(2016 - 1800, 4, 2));
        flight2.setTickets(Arrays.asList(t2));

        Flight flight3 = new Flight();
        Passenger p3 = new Passenger();
        Tickets t3 = new Tickets();
        p3.setFirstName("Jason");
        p3.setLastName("Roaring");
        t3.setPassenger(p3);
        t3.setPrice(400);
        flight3.setDepartsOn(new Date(2016 - 1700, 3, 2));
        flight3.setTickets(Arrays.asList(t3));

        return Arrays.asList(flight2,flight3);
    }
    @PostMapping("/tickets/total")
    public Map<String,Integer> sumTicketsTotal(@RequestBody() Flight flight)
    {
        int total = 0;
        for(Tickets ticket : flight.getTickets())
        {
            total += ticket.getPrice();
        }
        Map<String,Integer> result = new HashMap<>();
        result.put("result", total);
        return result;
    }

}
