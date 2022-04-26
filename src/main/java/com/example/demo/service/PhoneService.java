package com.example.demo.service;

import com.example.demo.interfaceService.ISPhone;
import com.example.demo.interfaces.IPhone;
import com.example.demo.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService implements ISPhone {

    @Autowired
    private IPhone data;

    @Override
    public List<Phone> showAll() {
        //Porque es necesario realizar un cast?
        return (List<Phone>) data.findAll();
    }

    @Override
    public Optional<Phone> showById(int id) {
        return data.findById(id);
    }

}
