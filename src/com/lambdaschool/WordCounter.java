package com.lambdaschool;

import java.util.HashMap;

public class WordCounter {
  private String[] words;
  private HashMap<String, Integer> uniqueWordCount;

  public WordCounter(String words) {
    this.words = processInput(words);
    setUniqueWordCount();
  }

  private static String[] processInput(String input) {
    return input.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "").split(" +");
  }

  private void setUniqueWordCount() {
    HashMap<String, Integer> uniqueWordCount = new HashMap<String, Integer>();

    for (String word : words) {
      String lcWord = word.toLowerCase();

      if (uniqueWordCount.containsKey(lcWord)) {
        Integer wordCount = uniqueWordCount.get(lcWord);
        wordCount++;

        uniqueWordCount.put(lcWord, wordCount);
      } else {
        uniqueWordCount.put(lcWord, 1);
      }
    }

    this.uniqueWordCount = uniqueWordCount;
  }

  @Override
  public String toString() {
    return "WordCounter{" +
            "uniqueWordCount=" + uniqueWordCount +
            '}';
  }
}