import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPairsWhoseSumEqualsToTarget {
  public static void main(String[] args) {
    int[] arr = {2,4,10,0,-6};
    int targetSum = 4;
    var result = allPairsWhoseSumEqualsToTarget2(arr, targetSum);
    System.out.println("all pairs whose sum equals to the target are : " + result);
  }

  private static List<String> allPairsWhoseSumEqualsToTarget(int[] arr, int targetSum) {
    List<String> stringList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == targetSum) {
          stringList.add("("  + arr[i] + "," + arr[j] + ")");
        }
      }
    }
    return stringList;
  }

  private static Set<String> allPairsWhoseSumEqualsToTarget2(int[] arr, int targetSum) {
    Set<Integer> seen = new HashSet<>();
    Set<String> pairs = new HashSet<>();

    for (int currentSum : arr) {
      int needed = targetSum - currentSum;

      if (seen.contains(needed)) {
        pairs.add("(" + needed + "," + currentSum + ")");
      }

      seen.add(currentSum);
    }
    return pairs;
  }
}
