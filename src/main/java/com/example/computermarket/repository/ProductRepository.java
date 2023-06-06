package com.example.computermarket.repository;

import com.example.computermarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Интерфейс-репозиторий, который обеспечивает доступ к бд
//При расширении JpaRepository, указывается тип сущности и тип идентификатора сущности
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
