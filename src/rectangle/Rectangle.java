package rectangle;

public class Rectangle {
    int height;
    int width;

    void printArea() {
        System.out.println("Area of rectangle is " + (height * width));
    }

    private int height1;
    private int width2;
    void printArea2(int height1, int width2) {
        System.out.println("Area of rectangle is " + (height1 * width2));
    }

    //the other way to give value to vars is create methods "setVal":
    public void setHeight(int height) {
        if (height > 0) {
            height1 = height;
        }
    }
}
