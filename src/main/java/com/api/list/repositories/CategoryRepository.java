package com.api.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.list.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
