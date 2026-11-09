class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.side = 3;
        Shape shape = square;
        System.out.println("Area: " + shape.area());
    }
}
