package com.example.springgreetingdemo2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@
        Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;

    @Column(columnDefinition = "TEXT")
    private String comment;

    private int rating;

    private int likes;

    private LocalDate createdDate;

    public Feedback() {
        this.likes = 0;
        this.createdDate = LocalDate.now();
    }

    public Feedback(String author, String comment, int rating) {
        this.author = author;
        this.comment = comment;
        this.rating = rating;
        this.likes = 0;
        this.createdDate = LocalDate.now();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    // Getter Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
