package com.example.computermarket;

import com.example.computermarket.entities.Laptop;
import com.example.computermarket.entities.Product;
import com.example.computermarket.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//Точка входа в приложение
//Аннотация @SpringBootApplication уже объединяет в себе @Configuration, @EnableAutoConfiguration и @ComponentScan
@SpringBootApplication
public class ComputerMarketApplication {
    public static void main(String[] args) {
        //Создавая объект ConfigurableApplicationContext, можно получить доступ к компонентам приложения, включая бины
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(ComputerMarketApplication.class, args);

        //Сделал для примера
        ProductRepository productRepository = configurableApplicationContext.getBean(ProductRepository.class);
        Product product = new Laptop("N113102795", "DELL", 1000, 1, 16);
        productRepository.save(product);
    }
}
