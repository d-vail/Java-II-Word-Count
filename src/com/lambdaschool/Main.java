package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        WordCounter wc = new WordCounter("(2) No one shall be arbitrarily deprived of his property. Article 18. Everyone has the right to freedom of thought, conscience and religion;");
        wc.getTopWords(5);
        wc.getTopWords(10);
        wc.getTopWords(50);
    }
}
