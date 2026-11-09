public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{3, 6, 9, 12, 15}, 0));
    }
}
