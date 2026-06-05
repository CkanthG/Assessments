import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class FindFirstNonRepeatingCharacter {
  public static void main(String[] args) {
    String str = "swisswkjiklmnopqrstuvwyzlmnopqrstuvwxy";
    char result = findFirstNonRepeatingCharacter(str);
    if (result != '\0') {
      System.out.println("First non-repeating character: " + result);
    } else {
      System.out.println("No non-repeating character found.");
    }
  }

  public static char findFirstNonRepeatingCharacter(String str) {

    Map<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char c : str.toCharArray()) {
      if (map.get(c) == 1) {
        return c;
      }
    }

    return '\0';
  }
}
