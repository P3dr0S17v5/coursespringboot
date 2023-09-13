package com.pgdev.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdev.coursespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
