package com.land.site.plotbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.*;
@RestController
public class UserDetailsController {
    @GetMapping("/test")
    private String testing(){
        return "working";
    }
    @GetMapping("/date")
    private void dateStackOverflow() throws ParseException {
        int day = 17;
        int month = 11;
        int year = 2020;

//        LocalDateTime localDateTime = new LocalDateTime(day, month, year);

    }
}
