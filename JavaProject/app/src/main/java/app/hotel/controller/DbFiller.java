package app.hotel.controller;

import app.hotel.models.Guest;
import app.hotel.repositories.GuestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class DbFiller implements CommandLineRunner {

    private GuestRepository guestRepository;

    public DbFiller(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Guest guest1 = new Guest(
                "12345649638",
                "Marek",
                "Szafran",
                123456789
        );
       /* Guest guest2 = new Guest(
                "12345649620",
                "Michał",
                "Goleniewski",
                123336789
        );
        Guest guest3 = new Guest(
                "19325649620",
                "Radek",
                "Grela",
                123000789
        );
        */

        this.guestRepository.deleteAll();

        //List<Guest> guests = Arrays.asList(guest1,guest2,guest3);
        this.guestRepository.save(guest1);
    }
}
