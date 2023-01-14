package com.br.distributor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TBap_Product")
public class BeerAssignedProduct extends Beer{

    public BeerAssignedProduct(Beer beer) {
        super(beer.getBrand(), beer.getVessel(), beer.getVolume());
    }
}
