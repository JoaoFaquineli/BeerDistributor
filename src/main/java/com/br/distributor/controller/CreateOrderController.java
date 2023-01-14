package com.br.distributor.controller;

import com.br.distributor.dto.OrderDto;
import com.br.distributor.form.OrderForm;
import com.br.distributor.model.Order;
import com.br.distributor.repository.CustomerRepository;
import com.br.distributor.repository.OrderRepository;
import com.br.distributor.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CreateOrderController {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping
    public List<OrderDto> list(){
        List<Order> orders = orderRepository.findAll();
        return OrderDto.orderConverter(orders);
    }

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderForm orderForm, UriComponentsBuilder uriBuilder) {
        Order order = orderForm.convert(customerRepository,productsRepository);
        orderRepository.save(order);
        URI uri = uriBuilder.path("/order/{id}").buildAndExpand(order.getId()).toUri();
        return ResponseEntity.created(uri).body(new OrderDto(order));
    }




}
