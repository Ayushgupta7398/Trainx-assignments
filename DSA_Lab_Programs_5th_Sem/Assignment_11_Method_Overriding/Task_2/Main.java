class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 4;
        rectangle.breadth = 5;
        System.out.println("Area: " + rectangle.area());
    }
}
