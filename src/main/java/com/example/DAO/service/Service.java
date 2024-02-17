package com.example.DAO.service;

import com.example.DAO.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
