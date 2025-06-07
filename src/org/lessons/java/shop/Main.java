package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Product prodotto1 = new Product(("iPhone"), "telefono bello ma costoso", 900, 22);

        String printProduct = "Codice prodotto: " + prodotto1.code + " | " + "nome: " + prodotto1.name + " | "
                + "descrizione: " + prodotto1.description + " | "
                + "Prezzo (esclusa iva): " + String.format("%.2f", prodotto1.basePrice()) + " euro | "
                + "Prezzo (inclusa iva): "
                + String.format("%.2f", prodotto1.taxedPrice()) + " euro | "
                + "Nome esteso: " + prodotto1.getFullName();

        System.out.println(printProduct);
    }

}
