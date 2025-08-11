package FullStack;
import java.util.*;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        double R = sc.nextDouble();
        double area = 1.44 * Math.pow(R, 2);
        System.out.println(area);
        
    }
}

