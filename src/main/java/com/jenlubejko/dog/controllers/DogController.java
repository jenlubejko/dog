package com.jenlubejko.dog.controllers;

import com.jenlubejko.dog.models.Dog;
import com.jenlubejko.dog.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogRepository dogRepository;

    @GetMapping
    public List<Dog> list() {
        return (List<Dog>) dogRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Dog dog) {
        dogRepository.save(dog);
    }

    @GetMapping("/{id}")
    public Optional<Dog> get(@PathVariable("id") long id) {
        return dogRepository.findById(id);
    }
}
