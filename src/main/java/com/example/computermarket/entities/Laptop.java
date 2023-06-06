package com.example.computermarket.entities;

import jakarta.persistence.*;

//Entity-класс ноутбука, который может быть сохранен в бд
@Entity
public class Laptop extends Product {
    //Размер экрана
    private int screenSize;

    public Laptop() {
    }

    public Laptop(String serialNumber, String manufacturer, double price, int quantity, int screenSize) {
        super(serialNumber, manufacturer, price, quantity);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}


