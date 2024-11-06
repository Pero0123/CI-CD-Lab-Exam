package ie.atu.cicdlabexam;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rentals {
    @Pattern()
    String rentalCode;
    String carModel;
    String renterName;
    String renterEmail;
    @DateTimeFormat
    @FutureOrPresent
    String rentalStartDate;
    @DateTimeFormat
    @Future
    String rentalEndDate;
    float dailyRate;
}
