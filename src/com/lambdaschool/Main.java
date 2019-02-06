package com.lambdaschool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static final String EXIT_COMMAND = "exit";
    private static final String HELP_MESSAGE = "*** Analyze Word Count ***" +
            "\nTo begin analyzing, load a file or choose to enter a string." +
            "\n" +
            "\nCommands" +
            "\n========" +
            "\nLoad a file [file file_path] Ex. file ./text/example.txt" +
            "\nInput a string [input input_string] Ex. input Hello World!" +
            "\nGet top words [top number_of_words] Ex. top 50" +
            "\nExit [exit]" +
            "\n";

    private static void print(String output) {
        System.out.println(output);
    }

    private static String getCmd(String input) {
        int endIndex = input.indexOf(' ');
        return endIndex == -1 ? input : input.substring(0, endIndex);
    }

    private static String getArg(String input) {
        int beginIndex = input.indexOf(' ');
        return beginIndex == -1 ? "" : input.substring(beginIndex).trim();
    }

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
        Scanner scanner = new Scanner(System.in);
        String data = "";

        print(HELP_MESSAGE);

        do {
            String input = scanner.nextLine();
            String cmd = getCmd(input);
            String arg = getArg(input);

            if(cmd.equals("file") || cmd.equals("input")) {
                data = cmd.equals("file") ? readFile(arg) : arg;
            } else if(cmd.equals("top")) {
                if(data.isBlank()) {
                    print("Error reading data: use the file or input command to load data");
                } else {
                    WordCounter wc = new WordCounter(data);
                    try{
                        wc.getTopWords(Integer.parseInt(arg));
                    } catch (NumberFormatException error) {
                        print("Error fetching data: argument malformed");
                    }
                }
            } else if (input.equals(EXIT_COMMAND)) {
                print("Exiting...");
                break;
            } else {
                print("Command not found!");
            }

        } while(scanner.hasNextLine());


        scanner.close();
    }
}