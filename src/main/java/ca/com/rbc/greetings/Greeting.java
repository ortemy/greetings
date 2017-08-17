package ca.com.rbc.greetings;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class Greeting {

     @Id
     private String id;
     private String message;
     private GreetingType greetingType;

}
