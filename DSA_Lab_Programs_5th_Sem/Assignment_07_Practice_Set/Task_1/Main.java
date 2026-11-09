public class Main {
    public static void main(String[] args) {
        int[] values = {45, 52, 80};
        int key = 52;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
