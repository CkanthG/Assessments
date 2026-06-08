import java.util.HashMap;
import java.util.Map;


public class CompressAString {
  public static void main(String[] args) {
    String str = "aaabbcccc";
    var result = compressAString2(str);
    System.out.println("Compressed String: " + result);
  }

  private static String compressAString(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> sb.append(k).append(v));
    return sb.toString();
  }

  private static String compressAString2(String str) {
    if (str == null || str.isEmpty()) return "";
    StringBuilder sb = new StringBuilder();
    Character temp = null;
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (temp == null) {
        temp = c;
        count++;
      } else if (temp == c) {
        temp = c;
        count++;
      } else {
        sb.append(temp).append(count);
        temp = c;
        count = 1;
      }
    }
    sb.append(temp).append(count);
    return sb.toString();
  }
}
