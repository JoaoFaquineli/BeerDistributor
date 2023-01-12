package com.br.distributor.model;

import com.br.distributor.dto.OrderDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;


@Entity(name = "TBOrder")
@Table(name = "TBOrder")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @Autowired
   @OneToMany
    private List<Product> products;
    @Setter
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }
}
