package com.example.computermarket.entities;

import jakarta.persistence.*;

//Entity-класс жесткого диска, который может быть сохранен в бд
@Entity
public class HardDrive extends Product {
    //Объем жесткого диска
    private int capacity;

    public HardDrive() {
    }

    public HardDrive(String serialNumber, String manufacturer, double price, int quantity, int capacity) {
        super(serialNumber, manufacturer, price, quantity);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
