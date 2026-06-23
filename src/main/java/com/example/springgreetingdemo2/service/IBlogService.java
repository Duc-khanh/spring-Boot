package com.example.springgreetingdemo2.service;

import com.example.springgreetingdemo2.model.Blog;
import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void delete(Long id);
}
