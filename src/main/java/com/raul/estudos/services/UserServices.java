package com.raul.estudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.estudos.entities.User;
import com.raul.estudos.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj= userRepository.findById(id);
        return obj.get();
        
    }

    public User save(User u){
        return userRepository.save(u);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
