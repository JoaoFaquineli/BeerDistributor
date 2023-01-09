package com.br.distributor.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Beer extends Product{

    @Getter @Setter
    private String brand;
    @Getter @Setter
    private Vessel vessel;
    @Getter @Setter
    private int volume;

    public Beer() {
    }

    public Beer(Long id, String name, String brand, Vessel vessel, int volume) {
        super(id, name);
        this.brand = brand;
        this.vessel = vessel;
        this.volume = volume;
    }

}
