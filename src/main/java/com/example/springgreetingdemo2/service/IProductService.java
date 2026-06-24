package com.example.springgreetingdemo2.service;

import com.example.springgreetingdemo2.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();


    Optional<Product> findById(Long id);
}
