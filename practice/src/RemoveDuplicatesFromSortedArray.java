import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
    var result = removeDuplicates(arr);
    System.out.println("Array Elements : " + result);

  }

  private static int removeDuplicates(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Invalid Input");
    }
    int write = 1;
    for (int read = 1; read < arr.length; read++) {
      if (arr[read] != arr[read - 1]) {
        arr[write] = arr[read];
        write++;
      }
    }
    System.out.println("Final Array : " + Arrays.toString(arr));
    return write;
  }
}
