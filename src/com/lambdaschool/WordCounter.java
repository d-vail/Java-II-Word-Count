package com.lambdaschool;

import java.util.*;

public class WordCounter {
  private final HashMap<String, Integer> UNIQUE_WC;
  private final ArrayList<HashMap.Entry<String, Integer>> SORTED_WC;

  WordCounter(String str) {
    this.UNIQUE_WC = getUniqueWC(processStr(str));
    this.SORTED_WC = sortWC(UNIQUE_WC);
  }

  void getTopWords(Integer num) {
    System.out.println("*** Top " + num + " Words ***");
    Integer i = 0;

    while(i < num && i < SORTED_WC.size()) {
      System.out.println((i + 1) +
              ": Word=" + SORTED_WC.get(i).getKey() +
              ", Count=" + SORTED_WC.get(i).getValue());
      i++;
    }
  }

  private static String[] processStr(String str) {
    return str.replaceAll("[.?!,;:{}()']", "").split(" +");
  }

  private static HashMap<String, Integer> getUniqueWC(String[] words) {
    HashMap<String, Integer> uniqueWC = new HashMap<>();

    for (String word : words) {
      String lcWord = word.toLowerCase();

      if (uniqueWC.containsKey(lcWord)) {
        Integer wordCount = uniqueWC.get(lcWord);
        wordCount++;

        uniqueWC.put(lcWord, wordCount);
      } else {
        uniqueWC.put(lcWord, 1);
      }
    }

    return uniqueWC;
  }

  private static ArrayList<HashMap.Entry<String, Integer>> sortWC(HashMap<String, Integer> wordCount) {
    ArrayList<HashMap.Entry<String, Integer>> sortedWC = new ArrayList<>(wordCount.entrySet());
    sortedWC.sort((o1, o2) -> o2.getValue() - o1.getValue());
    return sortedWC;
  }

  @Override
  public String toString() {
    return "WordCounter{" +
            "UNIQUE_WC=" + UNIQUE_WC +
            ", SORTED_WC=" + SORTED_WC +
            '}';
  }
}