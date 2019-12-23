package com.learning.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public List<String> readInput(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}