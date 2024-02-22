package com.example.DAO.controller;

import com.example.DAO.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {
    private Repository repository;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name", required = false) String name) {
        return repository.getProductName(name);
    }
}
