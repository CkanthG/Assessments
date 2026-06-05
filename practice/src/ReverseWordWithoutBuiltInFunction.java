import java.util.Arrays;
import java.util.List;

public class ReverseWordWithoutBuiltInFunction {
  public static void main(String[] args) {
    String inputString = "Hello    World   University   How   are    you";
    var result = reverseWord(inputString);
    System.out.println("Reverse word is: " + result);
  }

  private static String reverseWord(String input) {
    if (input == null || input.isEmpty()) {
      return "";
    }

    List<String> wordList = Arrays.asList(input.trim().split("\\s+")); //.split(" ")

    StringBuilder result = new StringBuilder();
    for (int i = wordList.size() - 1; i >= 0; i--) {
      result.append(wordList.get(i)).append(" ");
    }
    return result.toString().trim();
  }
}
