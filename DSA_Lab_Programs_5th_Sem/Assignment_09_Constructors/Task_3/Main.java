class Counter {
    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("Count: " + counter.count);
    }
}
