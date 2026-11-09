class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Kiran";
        teacher.greet();
    }
}
