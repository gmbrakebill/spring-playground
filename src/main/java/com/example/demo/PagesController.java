package com.example.demo;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
public class PagesController {
    @PostMapping("/math2/sum2")
    public String getIndex(@RequestParam(value = "n") List<Integer> numbers)
    {
        int total = 0;
        for (int i=0;i<numbers.size();i++) {
            total += numbers.get(i);
        }

        return "the total is "+total;
    }
    @GetMapping("/math1/sum1")
    public String getInvoiceDate(@RequestParam(value = "n") String number)
    {
        return "hello";
    }
    @GetMapping("/math/pi")
    public String getPi()
    {
        return "3.141592653589793";
    }
    @GetMapping("/math/volume/{length}/{width}/{height}")
    public String getVolumeOfRectangle(
            @PathVariable(value = "length") int length,
            @PathVariable(value = "width") int width,
            @PathVariable(value = "height") int height)
    {
        int volume = length * width * height;

        return String.format("The volume of a %s"+ "x" + "%s" + "x" + "%s" + " rectangle is " + volume + "", length,width,height);
    }



    @GetMapping("/math/calculate")
    public String calculate(
            @RequestParam(value = "operation", required = false, defaultValue = "add") String operation,
            @RequestParam(value = "x", required = true) int x,
            @RequestParam(value = "y", required = true) int y

    )
    {
        if(operation.toLowerCase().equals("add"))
        {
            int val = x + y;
            return String.format("%s " + " + " + " %s = " + val + "", x, y);
        }
        else if( operation.toLowerCase().equals("multiply"))
        {
            int val = x * y;
            return String.format("%s " + " * " + " %s = " + val + "", x, y);
        }
        else if( operation.toLowerCase().equals("subtract"))
        {
            int val = x - y;
            return String.format("%s " + " - " + " %s = " + val + "", x, y);
        }
       else if (operation.toLowerCase().equals("divide"))
        {
            int val = x / y;
            return String.format("%s " + " / " + " %s = " + val + "", x, y);
        }
       else return "null";
    }
}
