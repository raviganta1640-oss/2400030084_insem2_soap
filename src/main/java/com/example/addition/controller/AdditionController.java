package com.example.addition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    @ResponseBody
    public String add(@RequestParam int a,
                      @RequestParam int b) {
        return "MS 1.1 - Additon = " + (a + b);
    }
 
}