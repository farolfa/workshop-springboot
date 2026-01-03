package com.raul.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raul.estudos.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
