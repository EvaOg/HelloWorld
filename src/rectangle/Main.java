package rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 6;
        rectangle.printArea();


        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 5;
        rectangle2.width = 3;
        rectangle2.printArea();

        Rectangle rectangle3 = new Rectangle();
        rectangle3.printArea2(5, 6);
    }
}
