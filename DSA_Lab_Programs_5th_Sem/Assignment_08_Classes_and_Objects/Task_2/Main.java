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
        Student first = new Student();
        first.roll = 5;
        first.name = "Rohan";
        Student second = new Student();
        second.roll = 8;
        second.name = "Meera";
        first.show();
        second.show();
    }
}
