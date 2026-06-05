import java.util.Arrays;

public class RotateArrayKTimesToRight {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int k = 5;
    var result = rotateKTimesRight(arr, k);
    System.out.println("result: " + Arrays.toString(result));
  }

  private static int[] rotateKTimesRight(int[] arr, int k) {
    if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
      return arr;
    }
    int n = arr.length;

    k = k % n;

    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[(i + k) % n] = arr[i];
    }

    return result;
  }
}
