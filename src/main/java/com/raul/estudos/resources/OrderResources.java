package com.raul.estudos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.estudos.entities.Order;
import com.raul.estudos.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    private OrderServices services;

    @GetMapping
    public List<Order> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        return services.findById(id);
    }

    @PostMapping
    public Order save(Order order){
        return services.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        services.delete(id);
    }
}
