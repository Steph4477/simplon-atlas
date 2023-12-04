package co.simplon.atlas.api.controller;
import co.simplon.atlas.api.database.Database;
import co.simplon.atlas.api.entities.Capital;

import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capitals")
public class CapitalController {

    @PostMapping
    public void createCapital(@RequestBody Capital capital) {
        capital.createCapital();
        System.out.println("Capital ID: " + capital.getId() + ", Name: " + capital.getName());
    }

    @GetMapping("/{id}")
    public Map<UUID, Capital> getCapital() {
        return Database.getCapitals();
        
    }
}
