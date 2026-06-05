import java.util.*;

class TopKFrequentWords {

  public static void main(String args[]){
    List<String> words = List.of(
      "java", "spring", "java",
      "docker", "spring", "java"
    );

    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    var result = map.entrySet().stream()
      .filter(entry -> entry.getValue() > 1)
      .map(Map.Entry::getKey)
      .sorted()
      .toArray(String[]::new);

    System.out.println("Top K Frequent Words:" +Arrays.toString(result));
    System.out.println("Top K Frequent Words Count:" + result.length);
  }
}
