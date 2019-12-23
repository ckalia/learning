package com.learning.parser;

import com.learning.model.Transaction;

import java.util.List;

public interface BankStatementParser {

    List<Transaction> getTransactions(List<String> lines);
}
