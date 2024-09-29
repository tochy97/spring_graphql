package com.tochy.graphql.model;

import jakarta.persistence.*;

@Entity
public class Post {

    // Variables
    @Id
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;
  
    @Column(name = "category")
    private String category;
  
    @Column(name = "info")
    private String info;

    // Constructor
    public Post() {}
    public Post(Integer id, String title, String category, String info){
        this.id = id;
        this.title = title;
        this.category = category;
        this.info = info;
    }

    // Getters
    public String getData() {
        return this.info;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory() {
        return this.category;
    }

    // Setters
    public void setData() {
        this.info = info;
    }
    public void setTitle() {
        this.title = title;
    }
    public void setCategory() {
        this.category = category;
    }

}
