import java.util.HashSet;
import java.util.Set;

class MissingInteger{

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
    int missingInteger = findMissingInteger(arr);
    System.out.println("Missing Integer: " + missingInteger);
  }

  public static int findMissingInteger(int[] arr) {
    Set<Integer> set = new HashSet<>();

    for (int num : arr) {
      if (num > 0) {
        set.add(num);
      }
    }
    int missingInteger = 1;
    while (set.contains(missingInteger)) {
      missingInteger++;
    }
    return missingInteger;
  }
}
