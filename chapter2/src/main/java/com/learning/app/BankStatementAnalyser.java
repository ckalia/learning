package com.learning.app;

import com.learning.parser.BankStatementParser;
import com.learning.parser.BankStatementParserFactory;
import com.learning.model.Transaction;
import com.learning.processor.BankStatementProcessor;
import com.learning.reader.FileReader;

import java.io.IOException;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyser {

    private final String filePath;
    private final FileReader fileReader = new FileReader();
    private final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor();
    private BankStatementParser bankStatementParser;

    public BankStatementAnalyser(String filePath) {
        this.filePath = filePath;
        bankStatementParser = BankStatementParserFactory.getParser(filePath);
    }

    public double calculateSummary() {

        double total = 0;
        try {
            List<String> lines = fileReader.readInput(filePath);
            List<Transaction> transactions = bankStatementParser.getTransactions(lines);
            System.out.println("Total : " + bankStatementProcessor.getTotalAmount(transactions));
            System.out.println("No. of transactions in JAN = "+bankStatementProcessor.getCountOfTransactions(Month.JANUARY, transactions));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return total;
    }
}
