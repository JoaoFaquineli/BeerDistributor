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
@Getter
public class OrderDto {
    private Long order_id;

    public OrderDto(Order order) {
        this.order_id = order.getId();
    }

    public static List<OrderDto> orderConverter(List<Order> orders)
    {
        return orders.stream().map(OrderDto::new).collect(Collectors.toList());
    }
}
