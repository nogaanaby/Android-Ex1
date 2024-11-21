package com.example.ex1;

public class Character {
    private String name;
    private String email;
    private String phone;
    private String hobby;
    private int imageResourceId;

    public Character(String name, String email, String phone, String hobby, int imageResourceId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.hobby = hobby;
        this.imageResourceId = imageResourceId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHobby() {
        return hobby;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
