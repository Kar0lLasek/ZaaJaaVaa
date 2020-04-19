package app.database.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

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


}
