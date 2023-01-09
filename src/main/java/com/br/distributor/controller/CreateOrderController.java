package com.br.distributor.controller;

import com.br.distributor.dto.OrderDto;
import com.br.distributor.form.OrderForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/order")
public class CreateOrderController {

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderForm form, UriComponentsBuilder uriBuilder) {

        return null;
    }




}
