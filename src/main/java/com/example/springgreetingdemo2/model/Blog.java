package com.example.springgreetingdemo2.model;

import java.time.LocalDate;

public class Blog {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDate dateCreated;

    public Blog() {
    }

    public Blog(Long id, String title, String content, String author, LocalDate dateCreated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
