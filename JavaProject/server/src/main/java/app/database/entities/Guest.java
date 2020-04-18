package app.database.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Guest {

    @Id
    private String pidn;
    private String name;
    private String surnamme;
    private int phoneNumber;

    public Guest() {
    }

    public Guest(String pidn, String name, String surnamme, int phoneNumber) {
        this.pidn = pidn;
        this.name = name;
        this.surnamme = surnamme;
        this.phoneNumber = phoneNumber;
    }

    public String getPidn() {
        return pidn;
    }

    public void setPidn(String pidn) {
        this.pidn = pidn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnamme() {
        return surnamme;
    }

    public void setSurnamme(String surnamme) {
        this.surnamme = surnamme;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
