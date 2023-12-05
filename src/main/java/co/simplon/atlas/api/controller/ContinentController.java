package co.simplon.atlas.api.controller;
import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Continent;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/continents")
public class ContinentController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createContinent(@RequestBody Continent continent) {
        Database.addContinent(continent);
        System.out.println( " id: " + continent.getId());

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Continent getContinent(@PathVariable UUID id) {
       Continent continent = Database.getContinent(id);
       return continent;
    }
}
