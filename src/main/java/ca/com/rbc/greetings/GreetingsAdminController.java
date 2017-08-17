package ca.com.rbc.greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


@Controller
public class GreetingsAdminController {

    @Autowired
    GreetingsService greetingsService;

    @RequestMapping(path ="/admin/greetings/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greetingsService.saveGreeting(greeting);
    }

    @RequestMapping(path="/admin/greetings/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Greeting updateGreeting(@RequestBody Greeting greeting, @PathVariable (name="id") String greetingId){
        return greetingsService.updateGreeting(greeting,greetingId);
    }

    @RequestMapping(path="/admin/greetings/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteGreeting(@PathVariable (name="id") String greetingId){
        return greetingsService.deleteGreeting(greetingId);
    }

    @RequestMapping(path="/admin/greetings/", method = RequestMethod.GET)
    @ResponseBody
    public List<Greeting> listGreetings(){
        return greetingsService.getAllGreetings();
    }
}
