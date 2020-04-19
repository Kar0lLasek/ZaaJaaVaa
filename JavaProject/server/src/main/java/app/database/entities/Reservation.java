package app.database.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter

@Document
public class Reservation {

    @Id
    private String id;
    private Guest guest;
    private Room room;
    private Date startDate;
    private Date endDate;
    private float totalPrice;

    public Reservation() {
    }

    public Reservation(String id, Guest guest, Room room, Date startDate, Date endDate, float totalPrice) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }


}
