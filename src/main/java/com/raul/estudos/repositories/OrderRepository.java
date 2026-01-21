package com.raul.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raul.estudos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
