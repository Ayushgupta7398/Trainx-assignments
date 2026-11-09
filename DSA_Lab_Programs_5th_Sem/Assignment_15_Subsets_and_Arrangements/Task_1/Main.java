public class Main {
    static void printSubsets(int[] values, int index, String subset) {
        if (index == values.length) {
            System.out.println("{" + subset + "}");
            return;
        }
        printSubsets(values, index + 1, subset);
        String next = subset.isEmpty() ? String.valueOf(values[index])
                : subset + ", " + values[index];
        printSubsets(values, index + 1, next);
    }

    public static void main(String[] args) {
        printSubsets(new int[]{1, 2, 3}, 0, "");
    }
}
