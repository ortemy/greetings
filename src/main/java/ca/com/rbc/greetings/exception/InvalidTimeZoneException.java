package ca.com.rbc.greetings.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidTimeZoneException extends  RuntimeException {

    public InvalidTimeZoneException(String message){
        super(message);
    }
}
