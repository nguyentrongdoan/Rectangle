import java.util.Scanner;

//Khoi tao doi tuong thuoc lop Rectangle voi phuong thuc khoi tao chua 2 tham so width, height.
class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle:" + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }

}