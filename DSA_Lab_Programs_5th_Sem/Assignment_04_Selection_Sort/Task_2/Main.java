public class Main {
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11};
        for (int start = 0; start < values.length - 1; start++) {
            int smallestIndex = start;
            for (int i = start + 1; i < values.length; i++) {
                if (values[i] < values[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            int temp = values[start];
            values[start] = values[smallestIndex];
            values[smallestIndex] = temp;
        }
        for (int value : values) {
            System.out.println(value);
        }
    }
}
