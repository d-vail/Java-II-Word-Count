package com.lambdaschool;

import java.util.*;

public class WordCounter {
  private HashMap<String, Integer> uniqueWordCount;
  private ArrayList<HashMap.Entry<String, Integer>> sortedWordCount;

  public WordCounter(String input) {
    uniqueWordCount = findUniqueWordCount(processInput(input));
    sortedWordCount = sortWordCount(uniqueWordCount);
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

  private ArrayList<HashMap.Entry<String, Integer>> sortWordCount(HashMap<String, Integer> wordCount) {
    ArrayList<HashMap.Entry<String, Integer>> sortedWordCount = new ArrayList<HashMap.Entry<String, Integer>>();
    sortedWordCount.addAll(wordCount.entrySet());

    Collections.sort(sortedWordCount, new Comparator<HashMap.Entry<String, Integer>>() {
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
      }
    });

    return sortedWordCount;
  }

  @Override
  public String toString() {
    return "WordCounter{" +
            "uniqueWordCount=" + uniqueWordCount +
            ", sortedWordCount=" + sortedWordCount +
            '}';
  }
}