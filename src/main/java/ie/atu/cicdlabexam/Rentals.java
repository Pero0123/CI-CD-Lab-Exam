package ie.atu.cicdlabexam;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rentals {
    String rentalCode;
    String carModel;
    String renterName;
    String renterEmail;
    @DateTimeFormat
    String rentalStartDate;
    @DateTimeFormat
    String rentalEndDate;
    float dailyRate;
}
