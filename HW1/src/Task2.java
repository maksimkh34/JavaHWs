import java.text.DecimalFormat;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(7, 14);

        System.out.printf("Rectangle 1 created. W: %s, H: %s\nArea: %s, Perimeter: %s\n\n",
                rect1.getWidth(), rect1.getHeight(),
                rect1.calculateArea(), rect1.calculatePerimeter());

        System.out.printf("Rectangle 2 created. W: %s, H: %s\nArea: %s, Perimeter: %s\n",
                rect1.getWidth(), rect1.getHeight(),
                rect1.calculateArea(), rect1.calculatePerimeter());
    }
}
