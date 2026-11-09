public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int mark : marks) {
            if (mark > 60) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
