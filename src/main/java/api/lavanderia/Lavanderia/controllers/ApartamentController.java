package api.lavanderia.Lavanderia.controllers;

import api.lavanderia.Lavanderia.classes.Apartament;
import api.lavanderia.Lavanderia.database.Database;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartamentController {
    Database database;

    public ApartamentController(){
        database = new Database();
    }

    @GetMapping
    public List<Apartament> getAll(){
        return database.getApartments();
    }

    @PostMapping
    public Apartament create(@RequestBody Apartament newApt){
        var aptExist = database.getApartments().stream().filter(apt -> apt.getNumber().equals(newApt.getNumber())).findFirst();
        if (aptExist.isPresent()){
            return null;
        }
        database.addApartment(newApt);
        return newApt;
    }
}