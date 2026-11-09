public class Main {
    public static void main(String[] args) {
        int[] values = {52, 10, 52, 7, 52};
        int count = 0;
        for (int value : values) {
            if (value == 52) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
