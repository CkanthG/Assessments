import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

  public static void main(String[] args) {
    String inputString = "abcdefghijklmnopqrstuvwxyza";
    String longestSubstring = findLongestSubstring(inputString);
    System.out.println("Longest Substring: " + longestSubstring);
  }
  public static String findLongestSubstring(String inputString) {
    Set<Character> set = new HashSet<>();
    String longestSubstring = "";
    for  (int i = 0; i < inputString.length(); i++) {
      if (set.contains(inputString.charAt(i))) {
       break;
      } else {
        set.add(inputString.charAt(i));
      }
    }
    var it = set.iterator();
    while (it.hasNext()) {
      longestSubstring = longestSubstring + it.next();
    }
    return longestSubstring;
  }
}