package com.br.distributor.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Table(name = "TBProducts")
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Setter
    private String name;

    public Product(String stringProduct) {

        this.name = stringProduct;
    }
}
