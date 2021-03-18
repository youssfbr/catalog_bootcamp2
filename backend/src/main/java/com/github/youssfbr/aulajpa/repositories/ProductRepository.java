package com.github.youssfbr.aulajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.youssfbr.aulajpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
