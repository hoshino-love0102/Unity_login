// src/main/java/com/example/lostfound_project/model/LostItem.java
package com.example.lostfound_project.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String description;
    private String location;
    private LocalDateTime lostTime;
    private String writer;
    private String password;

    public LostItem() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getLostTime() {
        return lostTime;
    }
    public void setLostTime(LocalDateTime lostTime) {
        this.lostTime = lostTime;
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
