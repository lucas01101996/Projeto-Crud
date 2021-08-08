package com.produtos.deposito.repository;

import com.produtos.deposito.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {//buscar dados etc // acesso a dados

   //@Query("Select p from Product p WHERE p.name LIKE %?1%")
   //public List<Product> findAll(String keyword);

   Optional<Product> findById(Long id);

   Optional<Product> findByName(String name);

   //Page<Product> findAll(Pageable pageable);


}
