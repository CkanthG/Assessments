import java.util.concurrent.atomic.AtomicLong;

public class Counter {

  private final AtomicLong automicInteger = new AtomicLong();

  public void increment() {
    automicInteger.incrementAndGet();
  }

  public long getValue() {
    return automicInteger.get();
  }

  public static void main(String[] args) {
    Counter counter = new Counter();
    for (int i = 0; i < 1000; i++) {
      new Thread(counter::increment).start();
    }
    // Wait for all threads to finish
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Final count: " + counter.getValue());
  }
}