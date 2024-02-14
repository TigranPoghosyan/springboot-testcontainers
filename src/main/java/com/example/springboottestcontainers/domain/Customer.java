package com.example.springboottestcontainers.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@jakarta.persistence.Entity
@Table(name = "customers")
@Setter
@Getter
public class Customer {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_generator")
    @SequenceGenerator(name = "customer_id_generator", sequenceName = "customer_id_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

}
