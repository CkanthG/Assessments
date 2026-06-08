import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 1, 2};
    var result = findMajorityElement2(arr);
    System.out.println("Majority Element : " + result);
  }

  private static Integer findMajorityElement(int[] arr) {
    int majority = arr.length / 2;
    Integer majorityElement = null;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > majority) {
        majorityElement = entry.getKey();
      }
    }
    return majorityElement;
  }

  // Boyer-Moore Algorithm
  private static Integer findMajorityElement2(int[] arr) {
    int candidate = 0;
    int count = 0;
    for (int num : arr) {
      if (count == 0) {
        candidate = num;
      }

      count += (num == candidate) ? 1 : -1;
    }

    int freq = 0;
    for (int num : arr) {
      if (num == candidate) {
        freq++;
      }
    }

    return (freq > arr.length / 2) ? candidate : null;
  }
}
