package com.example.DAO.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@org.springframework.stereotype.Repository
public class Repository {
    private final String script = read("script_get_product_name.sql");
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        return entityManager
                .createQuery(script)
                .setParameter("name", name)
                .getResultList();
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
