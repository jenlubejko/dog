package com.jenlubejko.dog.controllers;

import com.jenlubejko.dog.models.Dog;
import com.jenlubejko.dog.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/dogs")
public class DogController {

    @Autowired
    private DogRepository dogRepository;

    //TODO: a service layer

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> list() {
        return (List<Dog>) dogRepository.findAll();
    }

    @PostMapping(value = "/create/dog", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void create(@RequestBody Dog dog) {
        dogRepository.save(dog);
    }

    @GetMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Dog> get(@PathVariable("id") long id) {
        return dogRepository.findById(id);
    }
}
