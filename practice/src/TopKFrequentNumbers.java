import java.util.*;

public class TopKFrequentNumbers {
  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 2, 2, 2, 3, 3, 5, 1,1};
    int k = 3;
    int[] topKFrequentNumbers = findTopKFrequentNumbers(nums, k);
    System.out.println("Top K Frequent Numbers: " + java.util.Arrays.toString(topKFrequentNumbers));
  }

  public static int[] findTopKFrequentNumbers(int[] nums, int k) {
    int[] topKFrequentNumbers = new int[k];
    Arrays.fill(topKFrequentNumbers, -1);
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }

    if (topKFrequentNumbers.length == 0) return topKFrequentNumbers;
    if (topKFrequentNumbers.length == 1) return topKFrequentNumbers;
    System.out.println("keys : "+map.keySet() + " values : " +  map.values());
    return map.entrySet().stream()
      .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
      .limit(k)
      .map(Map.Entry::getKey)
      .mapToInt(Integer::intValue)
      .toArray();
  }
}
