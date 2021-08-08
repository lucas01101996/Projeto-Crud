package com.produtos.deposito.entity;

import com.produtos.deposito.enums.CategoriaProduct;
import com.produtos.deposito.enums.StatusProduct;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Produto")
public class Product  implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    // BOTAR NOT NULL NOS ATRIBUTO
    @NotNull
    private String name;
    @NotNull
    private double price;
    @NotNull
    private String cod;
    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoriaProduct categoria;
    @Enumerated(EnumType.STRING)
    private StatusProduct status;

    public Product( String name, double price, CategoriaProduct categoria, StatusProduct status) {
        this.name = name;
        this.price = price;
        this.categoria = categoria;
        this.status = status;
    }
    public Product(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public CategoriaProduct getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduct categoria) {
        this.categoria = categoria;
    }

    public StatusProduct getStatus() {
        return status;
    }

    public void setStatus(StatusProduct status) {
        this.status = status;
    }
}
