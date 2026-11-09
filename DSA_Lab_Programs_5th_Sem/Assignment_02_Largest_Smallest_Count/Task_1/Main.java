public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int largest = marks[0];
        for (int mark : marks) {
            if (mark > largest) {
                largest = mark;
            }
        }
        System.out.println("Largest: " + largest);
    }
}
