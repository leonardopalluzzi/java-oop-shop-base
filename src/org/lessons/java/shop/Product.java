package org.lessons.java.shop;

import java.util.Random;

public class Product {

    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;

    public Product(String name, String description, float price, int iva) {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    float basePrice() {
        // stampa prezzo senza iva
        return price;
    }

    float taxedPrice() {
        // stampa prezzo con iva
        return price + (price * iva) / 100;
    }

    String getFullName() {
        return code + "-" + name;
    }
}
