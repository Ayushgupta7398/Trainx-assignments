public class Main {
    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 8};
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                int temp = values[i];
                values[i] = values[i + 1];
                values[i + 1] = temp;
            }
        }
        for (int value : values) {
            System.out.println(value);
        }
    }
}
