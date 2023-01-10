package com.br.distributor.repository;

import com.br.distributor.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
