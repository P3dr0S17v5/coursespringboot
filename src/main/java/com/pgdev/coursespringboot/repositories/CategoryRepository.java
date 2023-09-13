package com.pgdev.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdev.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
