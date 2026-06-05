import java.util.HashMap;
import java.util.Map;

public class FindTwoStringsAreAnagram {
  public static void main(String[] args) {
    String string1 = "1listen";
    String string2 = "silent1";
//    var result = findAnagramsUsingMultipleMaps(string1, string2);
    var result = findAnagramsUsingSingleMap(string1, string2);
    if (result) {
      System.out.println("two strings are anagram");
    } else {
      System.out.println("two strings are not anagram");
    }
  }

  private static boolean findAnagramsUsingSingleMap(String string1, String string2) {

    if (string1 == null && string2 == null) {
      return true;
    }

    if  (string1 == null || string2 == null || string1.length() != string2.length()) {
      return false;
    }

    Map<Character, Integer> counter = new HashMap<>();
    for (char ch : string1.toCharArray()) {
      counter.put(ch, counter.getOrDefault(ch, 0) + 1);
    }

    for (char ch : string2.toCharArray()) {
      Integer freq = counter.get(ch);
      if (freq == null) {
        return false;
      }

      if (freq == 1) {
        counter.remove(ch);
      } else {
        counter.put(ch, freq - 1);
      }
    }

    return counter.isEmpty();
  }

  private static boolean findAnagramsUsingMultipleMaps(String string1, String string2) {

    if  (string1 == null || string2 == null || string1.length() != string2.length()) {
      return false;
    }

    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    for (char c : string1.toCharArray()) {
      map1.put(c, map1.getOrDefault(c, 0) + 1);
    }
    for (char c : string2.toCharArray()) {
      map2.put(c, map2.getOrDefault(c, 0) + 1);
    }
    return map1.equals(map2);
  }


}
