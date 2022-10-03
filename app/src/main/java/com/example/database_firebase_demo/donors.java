package com.example.database_firebase_demo;

public class donors {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    String city;
    String contact;
    String blood;

    public donors(String name, String city, String contact, String blood) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        this.blood = blood;
    }



}
