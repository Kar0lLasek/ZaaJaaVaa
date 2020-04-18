package app.hotel.controller;

import app.database.entities.Guest;
import app.database.repositories.GuestRepository;
import app.database.repositories.ReservationRepository;
import app.database.repositories.RoomRepository;
import app.database.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hotel")
public class HotelController {

    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;
    private RoomRepository roomRepository;
    private UserRepository userRepository;

    public HotelController(GuestRepository guestRepository, ReservationRepository reservationRepository, RoomRepository roomRepository, UserRepository userRepository) {
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
        this.userRepository = userRepository;
    }

    /* ************************GUESTS************************************* */
    @GetMapping("/allGuests")
    public List<Guest> getAllGuests(){
        List<Guest> guests = this.guestRepository.findAll();
        return guests;
    }

    /* ************************USERS************************************* */

    /* ************************ROOMS************************************* */

    /* *********************RESERVATIONS*********************************** */

}
