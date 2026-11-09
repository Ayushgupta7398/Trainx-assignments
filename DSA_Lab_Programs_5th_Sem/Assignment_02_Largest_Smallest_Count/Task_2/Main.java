public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int smallest = marks[0];
        for (int mark : marks) {
            if (mark < smallest) {
                smallest = mark;
            }
        }
        System.out.println("Smallest: " + smallest);
    }
}
