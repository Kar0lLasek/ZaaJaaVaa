package app.hotel.controller;

import app.hotel.entities.Guest;
import app.hotel.repositories.GuestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        this.guestRepository.deleteAll();

        this.guestRepository.save(guest1);
    }
}
