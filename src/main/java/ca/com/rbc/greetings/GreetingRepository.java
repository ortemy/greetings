package ca.com.rbc.greetings;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;


public interface GreetingRepository extends MongoRepository<Greeting, String> {

    Greeting findByGreetingType(@Param("greetingType") GreetingType greetingType);
}
