package com.example.demo.interfaceService;

import com.example.demo.model.Phone;

import java.util.Optional;

public interface ISPhone {
    public abstract Iterable<Phone> showAll();
    public abstract Optional<Phone> showById(int id);
}
