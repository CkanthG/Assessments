public class StringIsPalindromeOrNot {
  public static void main(String[] args) {
    String str = "madam";
    Boolean result = stringIsPalindrome(str);
    System.out.println("Given String is " + (result ? "Palindrome" : "Not Palindrome"));
  }

  private static Boolean stringIsPalindrome(String str) {
    if (str == null) return false;
    if (str.length() == 1) return false;
    if (str.length() % 2 == 0) throw new IllegalArgumentException("This is not a palindrome.");

    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
