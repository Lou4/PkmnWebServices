package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import persistentData.Pokemon;
import persistentData.PokemonDescription;

/* Rest controller annotation. Inform spring that has to convert the object return from controller 
 * method into json or xml response */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    /*This annotation inform spring that this method recive an http request.*/
    @RequestMapping(value = "/helloLou",
    				method = RequestMethod.GET, 
    				produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    /*This annotation inform spring that this method recive an http request.*/
    @RequestMapping(value = "/desc",
    				method = RequestMethod.GET, 
    				produces = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon getDesc(@RequestParam(value="pkmn", defaultValue="none") String pokemon) {
    	PokemonDescription pokemonDescription = new PokemonDescription();
        return pokemonDescription.getPokemon(pokemon);
    }
}
