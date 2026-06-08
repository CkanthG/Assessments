import java.util.Arrays;

public class FindSecondLargestNumber {
  public static void main(String[] args) {
    int[] arr = {3,3,3};
    var secondLargestNumber = findSecondLargestNumber2(arr);
    System.out.println("Second Largest Number: " + secondLargestNumber);
  }

  private static Integer findSecondLargestNumber2(int[] arr) {
    if  (arr == null ||  arr.length < 2) {
      return null;
    }
    Integer largest = null;
    Integer secondLargest = null;

    for (int i : arr) {
      if (largest == null || i > largest) {
        secondLargest = largest;
        largest = i;
      } else if ((secondLargest == null || i > secondLargest) && i != largest) {
        secondLargest = i;
      }
    }

    return secondLargest;
  }
}
