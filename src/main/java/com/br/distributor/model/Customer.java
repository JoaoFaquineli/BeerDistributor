package com.br.distributor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.TreeMap;
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @Getter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter @Setter
    @OneToMany
    private List<Product> stock;

    @Getter
    private LocalDateTime dataCriacao = LocalDateTime.now();
}
