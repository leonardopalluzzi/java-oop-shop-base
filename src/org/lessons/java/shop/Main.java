package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Product prodotto1 = new Product(("iPhone"), "telefono bello ma costoso", new BigDecimal(900),
                new BigDecimal(22));

        Student mario = new Student("Mario", "Sfronticiulli", 26);

        String printProduct = "Codice prodotto: " + prodotto1.getCode() + " | " + "nome: " + prodotto1.getName() + " | "
                + "marca: " + prodotto1.getBrand() + " | "
                + "Prezzo (esclusa iva): " + String.format("%.2f", prodotto1.getBasePrice()) + " euro | "
                + "Prezzo (inclusa iva): "
                + String.format("%.2f", prodotto1.getTaxedPrice()) + " euro | "
                + "Nome esteso: " + prodotto1.getFullName();

        System.out.println(printProduct);
        System.out.println(mario.getStudet());
    }

}
