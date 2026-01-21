package com.raul.estudos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.estudos.entities.Order;
import com.raul.estudos.repositories.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Order save(Order order){
        return repository.save(order);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
