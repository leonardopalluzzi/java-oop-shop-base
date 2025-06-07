package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal iva;

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        Random r = new Random();
        this.code = r.nextInt(5000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    };

    public BigDecimal getBasePrice() {
        // stampa prezzo senza iva
        return price;
    };

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
        return code + "-" + name;
    };
}
