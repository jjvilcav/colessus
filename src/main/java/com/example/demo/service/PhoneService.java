package com.example.demo.service;

import com.example.demo.interfaceService.ISPhone;
import com.example.demo.model.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService implements ISPhone {

    @Override
    public List<Phone> showAll() {
        return null;
    }

}
