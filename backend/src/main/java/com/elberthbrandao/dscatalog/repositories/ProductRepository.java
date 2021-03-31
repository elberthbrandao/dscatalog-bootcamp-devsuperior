package com.elberthbrandao.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
