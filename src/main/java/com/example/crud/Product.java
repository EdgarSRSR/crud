package com.example.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
  private Long id;
  private String name;
  private String brand;
  private String madein;
  private float price;

  protected Product() {
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getMadein() {
    return madein;
  }

  public void setMadein(String madein) {
    this.madein = madein;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}

/*
https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql

CREATE TABLE product(
(# id SERIAL PRIMARY KEY,
(# name VARCHAR(45) NOT NULL,
(# brand VARCHAR(45) NOT NULL,
(# madein VARCHAR(45) NOT NULL,
(# price FLOAT NOT NULL);

INSERT INTO product(name,brand,madein,price) VALUES ('chagochay','sibereco','russia',280);

*/

