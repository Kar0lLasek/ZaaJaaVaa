package app.database.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document
public class User {

    @Id
    private String name;
    private String surname;
    private String userType;

    public User() {
    }

    public User(String name, String surname, String userType) {
        this.name = name;
        this.surname = surname;
        this.userType = userType;
    }
}
