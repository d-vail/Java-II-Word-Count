package com.lambdaschool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static String readFile(String path) {
        String str = "";

        try {
            str = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException error) {
            System.out.println("Error reading file: " + error);
        }

        return str;
    }

    public static void main(String[] args) {
        String path = "./text/example.txt";
        WordCounter wc = new WordCounter(readFile(path));
        wc.getTopWords(50);
    }
}