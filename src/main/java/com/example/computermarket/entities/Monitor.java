package com.example.computermarket.entities;

import jakarta.persistence.*;

//Entity-класс монитора, который может быть сохранен в бд
@Entity
public class Monitor extends Product {
    //Диагональ экрана
    private double screenSize;

    public Monitor() {
    }

    public Monitor(String serialNumber, String manufacturer, double price, int quantity, double screenSize) {
        super(serialNumber, manufacturer, price, quantity);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
