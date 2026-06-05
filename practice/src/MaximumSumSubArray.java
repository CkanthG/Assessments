import java.util.*;

public class MaximumSumSubArray {
  public static void main(String[] args) {
    int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    var sum = maximumSumSubArray2(array);
    System.out.println("sum = " + sum);
  }

  private static Long maximumSumSubArray(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("array is null or empty");
    }
    int currentSum = array[0];
    int maxSum = array[0];

    for (int j : array) {
      currentSum = Math.max(j, currentSum + j);

      maxSum = Math.max(maxSum, currentSum);
    }
    return (long) maxSum;
  }

  private static Long maximumSumSubArray2(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("array is null or empty");
    }
    int maxSum = array[0];
    int currentSum = array[0];

    int startIndex = 0;
    int endIndex = 0;
    int tempStart = 0;

    for (int i = 1; i < array.length; i++) {

      if (array[i] > currentSum + array[i]) {
        currentSum = array[i];
        tempStart = i;
      } else {
        currentSum += array[i];
      }

      if (currentSum > maxSum) {
        maxSum = currentSum;
        startIndex = tempStart;
        endIndex = i;
      }
    }

    List<Integer> list = new ArrayList<>();
    while (startIndex <= endIndex) {
      list.add(array[startIndex]);
      startIndex++;
    }
    System.out.println("Sub Array: " + list);

    return (long) maxSum;
  }
}
