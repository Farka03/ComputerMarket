package com.example.computermarket.service;

import com.example.computermarket.entities.Product;
import com.example.computermarket.exception_handling.ResourceNotFoundException;
import com.example.computermarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Класс-сервис
@Service
public class ProductServiceImpl implements ProductService {
    //Внедрение репозитория
    @Autowired
    private ProductRepository productRepository;

    //Добавление продукта
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    //Редактирование продукта
    @Override
    public Product editProduct(Product product) {
        return productRepository.save(product);
    }

    //Получение всех продуктов
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Получение продукта по id
    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Product now found with id: " + id));
    }
}

