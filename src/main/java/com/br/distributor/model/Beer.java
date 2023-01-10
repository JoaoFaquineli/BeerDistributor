package com.br.distributor.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Beer extends Product{

    @Setter
    private String brand;
    @Setter
    private Vessel vessel;
    @Setter
    private int volume;

}
