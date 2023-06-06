package com.example.computermarket.entities;

import jakarta.persistence.*;

//Entity-класс компьютера, который может быть сохранен в бд
@Entity
public class DesktopComputer extends Product {
    //Форм-фактор компьютера
    private String formFactor;

    public DesktopComputer() {
    }

    public DesktopComputer(String serialNumber, String manufacturer, double price, int quantity, String formFactor) {
        super(serialNumber, manufacturer, price, quantity);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}
