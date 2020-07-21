package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/json")
public class JSONController {

    @GetMapping("/person")
    public List<Person> getPeople()
    {
        Person person = new Person();
        Date mydate = new Date();
        mydate.toString();
        person.setFirstName("Mike");
        person.setLastName("Lawry");
        person.setMySecretCodez("very secret");
        person.setWeight(50);
        person.setDescription("Large man yes");
        person.setDepartsOn(new Date(2014-1900,5,8));
        Person person1 = new Person();
        person1.setFirstName("Jason");
        person1.setLastName("Quizzby");
        person1.setMySecretCodez("secret");
        person1.setWeight(200);
        person1.setDescription("Oh my, big big man");

        return Arrays.asList(person,person1);
    }
}
