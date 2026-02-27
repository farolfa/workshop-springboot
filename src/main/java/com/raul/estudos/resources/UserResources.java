package com.raul.estudos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.estudos.entities.User;
import com.raul.estudos.services.UserServices;

@RestController
@RequestMapping(value ="/users")
public class UserResources {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list=services.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<User> save(User u){
        return ResponseEntity.ok().body(services.save(u));
    }
    @DeleteMapping
    public ResponseEntity<Void> delete (@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }
}
