public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        return Math.max(a[i], max(a, i + 1));
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{3, 6, 9, 12, 15}, 0));
    }
}
