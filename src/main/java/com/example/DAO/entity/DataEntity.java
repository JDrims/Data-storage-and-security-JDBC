package com.example.DAO.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Customers alexey = Customers.builder()
                .name("alexey")
                .surname("alexey")
                .age(28)
                .phoneNumber("77777777777")
                .build();
        Customers anrei = Customers.builder()
                .name("anrei")
                .surname("anrei")
                .age(40)
                .phoneNumber("77777777777")
                .build();
        Customers sahsa = Customers.builder()
                .name("sahsa")
                .surname("sahsa")
                .age(21)
                .phoneNumber("77777777777")
                .build();
//        entityManager.persist(alexey);
//        entityManager.persist(anrei);
//        entityManager.persist(sahsa);
        Orders desktop = Orders.builder()
                .date(new Date())
                .customers(alexey)
                .productName("desktop")
                .amount(4)
                .build();
        Orders laptop = Orders.builder()
                .date(new Date())
                .customers(anrei)
                .productName("laptop")
                .amount(2)
                .build();
        Orders iphone = Orders.builder()
                .date(new Date())
                .customers(anrei)
                .productName("iphone")
                .amount(3)
                .build();
//        entityManager.persist(desktop);
//        entityManager.persist(laptop);
//        entityManager.persist(iphone);
    }
}
