package com.produtos.deposito.controller;

import com.produtos.deposito.entity.Product;
import com.produtos.deposito.repository.ProductRepository;
import com.produtos.deposito.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product", method =  RequestMethod.GET)//buscar todos
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    Optional<Product> listaProdutoUnico(@PathVariable Long id){
        return productRepository.findById(id);
    }

    @GetMapping("/produto/{name}")
    List<Product> listaProduto(@PathVariable String name){
        return productRepository.findByName(name);
    }


    /*@GetMapping("/pr/{name}") //BUSCA PELO NOME
     Product viewHomePage(@PathVariable String name){
        String keyword = "coca";
        List<Product> listProduct = productService.listAll(keyword);
        return productRepository.findByName(name);
    }*/




    @RequestMapping(value = "/save", method = RequestMethod.POST)//salvar
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)//alterar
    public Product update(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/delete/{id}", method =  RequestMethod.DELETE)//deletar um produto pelo id
    public void findById(@PathVariable Long id){
        productRepository.deleteById(id); //

    }

}
