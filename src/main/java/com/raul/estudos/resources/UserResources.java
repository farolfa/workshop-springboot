package com.raul.estudos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.estudos.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"maria", "maria,maria@gmail.com", "991999191","123456");
        return ResponseEntity.ok().body(u);
    }
    
}
