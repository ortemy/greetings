package ca.com.rbc.greetings.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GreetingNotFoundException extends RuntimeException{

    public GreetingNotFoundException(String message){
        super(message);
    }
}
