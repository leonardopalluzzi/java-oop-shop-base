package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    public Product(String name, String brand, BigDecimal price, BigDecimal iva) {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    };

    public Product() {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = "No name";
        this.brand = "No brand";
        this.price = new BigDecimal(0);
        this.iva = new BigDecimal(22);
    }

    public BigDecimal getBasePrice() {
        // stampa prezzo senza iva
        return this.price;
    };

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTaxedPrice() {
        // stampa prezzo con iva
        if (price != null && iva != null) {
            BigDecimal divisor;
            if (iva.compareTo(BigDecimal.ZERO) > 0) {
                divisor = new BigDecimal(100);
            } else {
                divisor = new BigDecimal(1);
            }

            return price.add(price.multiply(iva).divide(divisor)).setScale(2, RoundingMode.DOWN);
        } else {
            return null;
        }
    };

    public String getFullName() {
        return this.code + "-" + this.name;
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCode() {
        return this.code;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
