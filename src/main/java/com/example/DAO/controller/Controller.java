package com.example.DAO.controller;

import com.example.DAO.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name", required = false) String name) {
        return service.getProductName(name);
    }
}
