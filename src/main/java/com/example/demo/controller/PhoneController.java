package com.example.demo.controller;

import com.example.demo.interfaceService.ISPhone;
import com.example.demo.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private ISPhone service;

    @GetMapping("/test")
    public String test(){
        return "Just testing";
    }

    @GetMapping("/phones")
    public List<Phone> show(){
        return service.showAll();
    }



}
