public class FindLongestCommonPrefixAmongStrings {
  public static void main(String[] args) {
    String[] str = {"flower","flow","flight"};
    var result = findLongestCommonPrefix(str);
    System.out.println("result = " + result);
  }

  private static String findLongestCommonPrefix(String[] str) {
    if (str == null) return "";
    if (str.length == 0) return "";
    if (str.length == 1) return str[0];

    String first = str[0];
    for (int i = 0; i < first.length(); i++) {
      char currentChar = first.charAt(i);

      for (int j = 1; j < str.length; j++) {

        if (i >= str[j].length() || str[j].charAt(i) != currentChar) {
          return first.substring(0, i);
        }
      }
    }

    return first;
  }
}
