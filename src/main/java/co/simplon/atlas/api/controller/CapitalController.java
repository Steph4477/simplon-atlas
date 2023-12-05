package co.simplon.atlas.api.controller;
import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Capital;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capitals")
public class CapitalController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCapital(@RequestBody Capital capital) {
        Database.addCapital(capital);
        System.out.println( " id: " + capital.getId());

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Capital getCapital(@PathVariable UUID id) {
       Capital capital = Database.getCapital(id);
       return capital;
    }
}
