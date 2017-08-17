package ca.com.rbc.greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    GreetingsService greetingsService;

    @RequestMapping(method = GET)
    public String getGreetings(@RequestParam(required = false, name="timeZone") String zone){
        return  greetingsService.getGreetingForTimezone(zone);
    }
}
