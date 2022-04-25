package com.example.demo.interfaces;

import com.example.demo.model.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhone extends CrudRepository<Phone,Integer> {

}
