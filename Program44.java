/* Program 44
Write a program to overload the function area(). Accept values from the user and print out the area of a square, rectangle and triangle.
04/06/24 */

import java.util.Scanner;

public class Volume {
    static double area(int s) { // square
        return s * s;
    }

    static double area(int l, int b) { // rectangle
        return l * b;
    }

    static double area(double b, double h) { // triangle
        return 0.5 * b * h;
    }

    static double input(String p) {
        Scanner sc = new Scanner(System.in);
        System.out.print(p);
        return sc.nextDouble();
    }

    public static void main(String args[]) {
        int choice = (int)input("Enter choice\n1. Square\n2. Rectangle\n3. Triangle\n");
        double res = -1;
        switch (choice) {
            case 1:
                int s = (int)input("Enter side length: ");
                res = area(s);
                break;
            case 2:
                int l = (int)input("Enter length: ");
                int b = (int)input("Enter breadth: ");
                res = area(l, b);
                break;
            case 3:
                double base = input("Enter base: ");
                double h = input("Enter height: ");
                res = area(base, h);
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("The area is " + res);
    }
}
