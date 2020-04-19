package app.database.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document
public class Room {

    @Id
    private String number;
    private int capacity;
    private float price;

    public Room() {
    }

    public Room(String number, int capacity, float price) {
        this.number = number;
        this.capacity = capacity;
        this.price = price;
    }
}
