import java.util.Scanner;
import java.lang.*;
public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double brith;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Area of rectangle:");
        System.out.println("Enter the length of triangle: ");
        length = input.nextDouble();
        System.out.println("Enter the brith of rectangle: ");
        brith = input.nextDouble();
        area = length * brith;
        System.out.println(" the area of rectangle is " + area);
        input.close();
    }
}
