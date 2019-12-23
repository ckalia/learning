package com.learning.model;

import java.time.LocalDate;

public class Transaction {

    private final LocalDate date;

    private final double amount;

    private final String remarks;


    public Transaction(LocalDate date, double amount, String remarks) {
        this.date = date;
        this.amount = amount;
        this.remarks = remarks;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
