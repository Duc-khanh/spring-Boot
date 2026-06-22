package com.example.springgreetingdemo2.service;


import com.example.springgreetingdemo2.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}