package com.pgdev.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdev.coursespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
