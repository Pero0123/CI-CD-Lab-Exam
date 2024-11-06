package ie.atu.cicdlabexam;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandle {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>>ShowErrors(MethodArgumentNotValidException exception1) {

        Map<String, String> errorList = new HashMap<>();

        for (FieldError error : exception1.getFieldErrors())
        {
            String err_name = error.getField();
            String err_message = error.getDefaultMessage();
            errorList.put(err_name,err_message);
        }
        return ResponseEntity.status(400).body(errorList);
    }
}
