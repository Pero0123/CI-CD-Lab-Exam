package ie.atu.cicdlabexam;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class RentalsService {
    private List<Rentals> myList = new ArrayList<>();
    public List<Rentals>addRental(Rentals rentals){
        myList.add(rentals);
        return myList;
    }

    public List<Rentals>getRental(@RequestParam rentalCode){
        return myList;
    }

    public List<Rentals>putRental(@PathVariable rentalCode, @RequestBody Rentals rentals){
        for(int count =0; count<myList.size();count++){
            if(myList.get(count).getRentalCode()==rentalCode){
                myList.set(count,rentals);
            }
        }
        return myList;
    }

    public List<Rentals>deleteRental(@PathVariable rentalCode){
        for(int count =0; count<myList.size();count++){
            if(myList.get(count).getRentalCode()==rentalCode){
                myList.remove(count);
            }
        }
        return myList;
    }
}
