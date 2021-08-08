package com.produtos.deposito.service;

import com.produtos.deposito.entity.Product;
import com.produtos.deposito.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {//regra de negocio
    @Autowired
    ProductRepository productRepository;

   //public List<Product> listAll(String keyword) {
       //if (keyword != null) {
           //return productRepository.findAll(keyword);
       //}
       //return productRepository.findAll();
   //}
}
