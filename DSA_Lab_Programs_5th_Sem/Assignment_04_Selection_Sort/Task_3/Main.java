public class Main {
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11};
        int smallestIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[smallestIndex]) {
                smallestIndex = i;
            }
        }
        int temp = values[0];
        values[0] = values[smallestIndex];
        values[smallestIndex] = temp;
        for (int value : values) {
            System.out.println(value);
        }
    }
}
