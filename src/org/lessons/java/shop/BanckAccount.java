package org.lessons.java.shop;

import java.math.BigDecimal;

public class BanckAccount {

    private int AccountNumber;
    private BigDecimal balance;

    public BanckAccount(int AccountNumber) {
        this.AccountNumber = AccountNumber;
        this.balance = new BigDecimal(0.00);
    }

    // deposito
    public String deposit(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(0)) > 0) {
            this.balance = balance.add(amount);
            String message = "Deposit successful";
            return message;
        } else {
            String message = "You cannot deposit a negative amount";
            return message;
        }
    }

    // prelievo
    public String withdrawal(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(0)) < 0) {
            String message = "You cannot withdrawal a negative amount";
            return message;
        } else {
            if (balance.compareTo(amount) >= 0) {
                this.balance = balance.subtract(amount);
                String message = "Withdrawal successful";
                return message;
            } else {
                String message = "Insufficient balance";
                return message;
            }
        }

    }

    // ottieni saldo
    public String getBalance() {
        String message = "Your balance is: " + this.balance + " euros;";
        return message;
    }

}
