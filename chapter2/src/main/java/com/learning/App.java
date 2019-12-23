package com.learning;

import com.learning.app.BankStatementAnalyser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BankStatementAnalyser bankStatementAnalyser = new BankStatementAnalyser("chapter2/src/main/resources/statement.csv");
        bankStatementAnalyser.calculateSummary();
    }
}
