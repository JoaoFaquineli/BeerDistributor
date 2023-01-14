package com.br.distributor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Beer extends Product  {

    @Setter
    private String brand;
    @Setter
    @Enumerated(EnumType.STRING)
    private Vessel vessel;
    @Setter
    private int volume;

}
