package ie.atu.cicdlabexam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {
    private RentalsService myRental;
    private Rentals rentals;

    public RentalController(RentalsService myRental){
        this.myRental = myRental;
    }

    @PostMapping("/rentals")
    public List<Rentals> newRental(@Valid @RequestBody Rentals rentals){
        this.rentals = rentals;
        return myRental.addRental(rentals);
    }

    @GetMapping("/rentals/{rentalCode}")
    public List<Rentals> getRental(@PathVariable String rentalCode)
    {
        return myRental.getRental();
    }
    @PutMapping("/rentals/{rentalCode}")
    public List<Rentals> putRental(@PathVariable String rentalCode,@RequestBody Rentals rentals){
        return myRental.putRental(rentalCode,rentals);
    }

    @DeleteMapping("/rentals/{rentalCode}")
    public List<Rentals> putRental(@PathVariable String rentalCode){
        return myRental.deleteRental(rentalCode);
    }
}
