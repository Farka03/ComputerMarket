package com.example.computermarket.controller;

import com.example.computermarket.entities.*;
import com.example.computermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Класс-контроллер, который обрабатывает веб-запросы
@RestController
@RequestMapping("/api") //Базовый путь для всех эндпоинтов данного контроллера
public class ProductController {
    //Внедрение productService
    @Autowired
    private ProductService productService;

    //POST-запрос, благодаря которому можно добавить новый продукт
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    //PUT-запрос, благодаря которому можно редактировать существующий продукт
    @PutMapping("/products")
    public Product editProduct(@RequestBody Product product) {
        return productService.editProduct(product);
    }

    //GET-запрос, благодаря которому можно получить все продукты
    @GetMapping("/products")
    public List<Product> getAllProducts() { //Теперь возвращаем не jsp страницу, а список всех работников
        List<Product> allProducts = productService.getAllProducts();
        return allProducts;
    }

    //GET-запрос,благодаря которому можно получить продукт по заданному id
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
}

