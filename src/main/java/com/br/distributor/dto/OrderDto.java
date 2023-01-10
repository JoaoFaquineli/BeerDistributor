package com.br.distributor.dto;

import com.br.distributor.model.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long id;

    public OrderDto(Order order) {
    }

    public static List<OrderDto> orderConverter(List<Order> orders)
    {
        return orders.stream().map(OrderDto::new).collect(Collectors.toList());
    }
}
