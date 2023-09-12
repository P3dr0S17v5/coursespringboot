package com.pgdev.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdev.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
