package com.learning.parser;

public class BankStatementParserFactory {

    private BankStatementParserFactory() {
        super();
    }

    public static BankStatementParser getParser(String fileName){
        if(fileName.endsWith(".txt")){
            return new BankStatementPsvParser();
        }else if(fileName.endsWith(".csv")){
            return new BankStatementCsvParser();
        }else {
            throw new IllegalArgumentException("Unsupported file format");
        }
    }
}
