package com.example.springgreetingdemo2.service;



import com.example.springgreetingdemo2.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SimpleCustomerServiceImpl implements CustomerService {

    private static final List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(
                1L,
                "Nguyen Van A",
                "a@gmail.com",
                "Ha Noi"));

        customers.add(new Customer(
                2L,
                "Tran Van B",
                "b@gmail.com",
                "Hai Phong"));

        customers.add(new Customer(
                3L,
                "Le Van C",
                "c@gmail.com",
                "Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}