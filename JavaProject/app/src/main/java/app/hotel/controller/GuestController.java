package app.hotel.controller;

import app.hotel.models.Guest;
import app.hotel.repositories.GuestRepository;
import app.hotel.repositories.ReservationRepository;
import app.hotel.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/guest")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    public GuestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping("/allGuests")
    public List<Guest> getAllGuests(){
        List<Guest> guests = this.guestRepository.findAll();
        return guests;
    }

}
