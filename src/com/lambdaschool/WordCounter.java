package com.lambdaschool;

import java.util.HashMap;

public class WordCounter {
  private HashMap<String, Integer> uniqueWordCount;

  public WordCounter(String input) {
    this.uniqueWordCount = findUniqueWordCount(processInput(input));
  }

  private static String[] processInput(String input) {
    return input.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "").split(" +");
  }

  private HashMap<String, Integer> findUniqueWordCount(String[] words) {
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

    return uniqueWordCount;
  }

  @Override
  public String toString() {
    return "WordCounter{" +
            "uniqueWordCount=" + uniqueWordCount +
            '}';
  }
}