package com.example.computermarket.entities;

import jakarta.persistence.*;

//Entity-класс продукта, который может быть сохранен в бд
@Entity
@Inheritance(strategy = InheritanceType.JOINED) //Стратегия наследования типа JOINED
public abstract class Product {
    //Первичный ключ. будет автоматически генерироваться при сохранении объекта в бд
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //Серийный номер
    private String serialNumber;
    //Проивзодитель
    private String manufacturer;
    //Цена
    private double price;
    //Количество
    private int quantity;

    public Product() {
    }

    public Product(String serialNumber, String manufacturer, double price, int quantity) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
