package com.example.realestate.controller;

import com.example.realestate.model.Property;
import com.example.realestate.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyRepository repository;

    @GetMapping
    public List<Property> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Property add(@RequestBody Property property) {
        return repository.save(property);
    }
}