class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.roll = 5;
        student.name = "Rohan";
        student.show();
    }
}
