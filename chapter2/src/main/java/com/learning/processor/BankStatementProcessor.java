package com.learning.processor;

import com.learning.model.Transaction;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
    public BankStatementProcessor() {
    }

    public double getTotalAmount(List<Transaction> transactions) {
        double total = 0;
        for (Transaction transaction : transactions) {
            total = total + transaction.getAmount();
        }
        return total;
    }

    public long getCountOfTransactions(Month month, List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getDate().getMonth().equals(month))
                .count();
    }
}