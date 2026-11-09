public class Main {
    static void printReverse(int[] a, int i) {
        if (i < 0) {
            return;
        }
        System.out.println(a[i]);
        printReverse(a, i - 1);
    }

    public static void main(String[] args) {
        int[] values = {3, 6, 9, 12, 15};
        printReverse(values, values.length - 1);
    }
}
