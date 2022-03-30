package com.gtecnologia.tddCompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtecnologia.tddCompleto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
