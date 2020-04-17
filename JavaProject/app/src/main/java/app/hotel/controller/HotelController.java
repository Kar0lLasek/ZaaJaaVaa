package app.hotel.controller;

import app.database.entities.Guest;
import app.database.repositories.GuestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hotel")
public class HotelController {

    private GuestRepository guestRepository;

    public HotelController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping("/allGuests")
    public List<Guest> getAllGuests(){
        List<Guest> guests = this.guestRepository.findAll();
        return guests;
    }

}
