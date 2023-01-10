package com.br.distributor.controller;

import com.br.distributor.dto.OrderDto;
import com.br.distributor.form.OrderForm;
import com.br.distributor.model.Order;
import com.br.distributor.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CreateOrderController {

    @Autowired
    private OrderRepository orderRepository;
    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderForm form, UriComponentsBuilder uriBuilder) {

        List<Order> orders = orderRepository.findAll();
        return (ResponseEntity<OrderDto>) OrderDto.orderConverter(orders);
    }




}
