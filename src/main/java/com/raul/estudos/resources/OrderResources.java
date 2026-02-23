package com.raul.estudos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<List<Order>> findAll(){
        List<Order> o = services.findAll();
        return ResponseEntity.ok().body(o);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order o = services.findById(id);
        return ResponseEntity.ok().body(o);
    }


}
