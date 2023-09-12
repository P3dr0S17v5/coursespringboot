package com.pgdev.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdev.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
