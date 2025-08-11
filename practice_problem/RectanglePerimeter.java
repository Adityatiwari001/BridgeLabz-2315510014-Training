package FullStack;
import java.util.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter Length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter Width of rectangle: ");
        double width = sc.nextDouble();

       
        double perimeter = 2 * (length + width);

     
        System.out.println("Perimeter of the rectangle: " + perimeter);

    }
}
