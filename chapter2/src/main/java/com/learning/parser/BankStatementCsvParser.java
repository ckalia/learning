package com.learning.parser;

import com.learning.model.Transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCsvParser implements BankStatementParser {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private Transaction parseLineFromCsv(String line) {
        final String[] lineFragments = line.split(",");
        LocalDate transactionDate = LocalDate.parse(lineFragments[0], DATE_FORMATTER);
        double amount = Double.parseDouble(lineFragments[1]);
        String remarks = lineFragments[2];
        return new Transaction(transactionDate, amount, remarks);
    }

    @Override
    public List<Transaction> getTransactions(List<String> lines) {
        List<Transaction> listOfTransactions = new ArrayList<>();
        for (String line : lines) {
            Transaction transaction = parseLineFromCsv(line);
            listOfTransactions.add(transaction);
        }
        return listOfTransactions;
    }
}
