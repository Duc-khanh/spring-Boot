package com.example.springgreetingdemo2.service;

import com.example.springgreetingdemo2.model.Blog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BlogService implements IBlogService {
    private static final Map<Long, Blog> blogs = new HashMap<>();
    private static long currentId = 1L;

    static {
        blogs.put(currentId, new Blog(currentId++, "Tích hợp Spring Security", "Spring Security là một framework mạnh mẽ và có khả năng tùy biến cao, cung cấp cả xác thực và phân quyền cho các ứng dụng Spring.", "Nguyen Van A", LocalDate.now().minusDays(2)));
        blogs.put(currentId, new Blog(currentId, "Giới thiệu về Thymeleaf", "Thymeleaf là một template engine hiện đại dành cho Java, hỗ trợ việc tạo các giao diện web động một cách dễ dàng và trực quan.", "Tran Thi B", LocalDate.now().minusDays(1)));
        currentId++;
    }

    @Override
    public List<Blog> findAll() {
        return new ArrayList<>(blogs.values());
    }

    @Override
    public Blog findById(Long id) {
        return blogs.get(id);
    }

    @Override
    public void save(Blog blog) {
        if (blog.getId() == null) {
            blog.setId(currentId++);
            blog.setDateCreated(LocalDate.now());
        }
        blogs.put(blog.getId(), blog);
    }

    @Override
    public void delete(Long id) {
        blogs.remove(id);
    }
}
