public class Main {
    static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (a[middle] == key) {
                return middle;
            }
            if (a[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{10, 20, 30, 40, 50}, 40));
    }
}
