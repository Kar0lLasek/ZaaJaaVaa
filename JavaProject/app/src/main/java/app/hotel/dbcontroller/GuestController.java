package app.hotel.dbcontroller;

import app.database.entities.Guest;
import app.database.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/guests")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;


    @GetMapping("/allGuests")
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @GetMapping("/guest/{id}")
    public Optional<Guest> getGuestById(@PathVariable("id") String id) {
        Optional<Guest> guest = this.guestRepository.findById(id);
        return guest;
    }

    @PutMapping
    public  void insertGuest(@RequestBody Guest guest){
        this.guestRepository.insert(guest);
    }

    @PostMapping
    public void updateGuest(@RequestBody Guest guest){
        this.guestRepository.save(guest);
    }

    @DeleteMapping
    public void deleteGuest(@RequestBody Guest guest){
        this.guestRepository.delete(guest);
    }

}
