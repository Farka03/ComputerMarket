package com.example.computermarket.service;

import com.example.computermarket.entities.Product;

import java.util.List;

//Интерфейс для сервиса
public interface ProductService {
    //Добавление продукта
    Product addProduct(Product product);

    //Редактирование продукта
    Product editProduct(Product product);

    //Получение всех продуктов
    List<Product> getAllProducts();

    //Получение продукта по id
    Product getProductById(int id);
}

