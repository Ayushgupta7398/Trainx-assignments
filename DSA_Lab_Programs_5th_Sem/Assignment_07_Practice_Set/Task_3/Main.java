public class Main {
    public static void main(String[] args) {
        int[] values = {2, 3, 4};
        int product = 1;
        for (int value : values) {
            product *= value;
        }
        System.out.println("Product: " + product);
    }
}
