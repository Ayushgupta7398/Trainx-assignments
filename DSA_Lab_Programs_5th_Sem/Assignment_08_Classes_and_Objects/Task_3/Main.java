class Book {
    int pages;

    boolean isLong() {
        return pages > 300;
    }
}

public class Main {
    public static void main(String[] args) {
        Book first = new Book();
        first.pages = 450;
        Book second = new Book();
        second.pages = 120;
        System.out.println(first.isLong());
        System.out.println(second.isLong());
    }
}
