import java.util.Arrays;

public class MoveAllZerosToTheEndPreservingOrder {
  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 2, 0, 5, 6, 9, 0};
    var result = moveAllZerosToTheEndPreservingOrder(arr);
    System.out.println(Arrays.toString(result));
  }

  private static int[] moveAllZerosToTheEndPreservingOrder(int[] arr) {
    int n = arr.length;
    int k = 0;
    for (int j : arr) {
      if (j != 0) {
        arr[k] = j;
        k++;
      }
    }
    for (int i = k; i < n; i++) {
      arr[i] = 0;
    }
    return arr;
  }
}
