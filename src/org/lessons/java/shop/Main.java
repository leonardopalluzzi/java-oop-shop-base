package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoise = -1;
        BanckAccount account1 = new BanckAccount(14432);
        Scanner input = new Scanner(System.in);
        StudentsRegister register = new StudentsRegister();

        while (userChoise != 0) {
            System.out.println(
                    "Premere 1 per visualizzare il prodotto, 2 per visualizzare la lista degli studenti, 3 per aggiungere uno studente, 4 per accedere al tuo conto bancario, 0 per uscire ");

            userChoise = input.nextInt();

            switch (userChoise) {
                case 1:

                    Product prodotto1 = new Product(("iPhone"), "telefono bello ma costoso", new BigDecimal(900),
                            new BigDecimal(22));

                    String printProduct = "Codice prodotto: " + prodotto1.getCode() + " | " + "nome: "
                            + prodotto1.getName()
                            + " | "
                            + "marca: " + prodotto1.getBrand() + " | "
                            + "Prezzo (esclusa iva): " + String.format("%.2f", prodotto1.getBasePrice()) + " euro | "
                            + "Prezzo (inclusa iva): "
                            + String.format("%.2f", prodotto1.getTaxedPrice()) + " euro | "
                            + "Nome esteso: " + prodotto1.getFullName();

                    System.out.println(printProduct);
                    break;
                case 2:
                    System.out.println(register.getStudents());
                    break;

                case 3:

                    input.nextLine();

                    System.out.println("Inserisci il nome dello studente:");
                    String firsName = input.nextLine();

                    System.out.println("Inserisci il cognome dello studente:");
                    String lastName = input.nextLine();

                    System.out.println("Inserisci l'eta dello studente:");
                    int age = input.nextInt();

                    register.setStudent(firsName, lastName, age);

                    System.out.println("Studente inserito correttamente");
                    break;

                case 4:

                    int operation = 0;

                    do {
                        System.out.println(
                                "Inserire 1 per visualizzare il saldo, 2 per effettuare un prelievo, 3 per effettuare un versamento, 0 per tornare al menu iniziale");
                        operation = input.nextInt();

                        switch (operation) {
                            case 1:
                                System.out.println(account1.getBalance());
                                break;
                            case 2:

                                System.out.println("Inserisci il denaro da prelevare:");
                                BigDecimal amount = input.nextBigDecimal();
                                System.out.println(account1.withdrawal(amount));

                                break;
                            case 3:
                                System.out.println("Inserisci il denaro da versare:");
                                BigDecimal depositAmount = input.nextBigDecimal();
                                System.out.println(account1.deposit(depositAmount));
                                break;
                        }
                    } while ((operation != 0));

            }
        }
        input.close();
    }
}
