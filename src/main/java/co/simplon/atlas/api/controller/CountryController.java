package co.simplon.atlas.api.controller;
import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Country;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCountry(@RequestBody Country country) {
        Database.addCountry(country);
        System.out.println( " id: " + country.getId());

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Country getCountry(@PathVariable UUID id) {
       Country country = Database.getCountry(id);
       return country;
    }
}