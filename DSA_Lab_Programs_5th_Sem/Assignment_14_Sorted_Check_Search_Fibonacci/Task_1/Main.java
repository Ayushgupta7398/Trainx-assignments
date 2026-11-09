public class Main {
    static boolean isSorted(int[] a, int i) {
        if (i >= a.length - 1) {
            return true;
        }
        return a[i] <= a[i + 1] && isSorted(a, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2, 4, 6, 8, 10}, 0));
    }
}
