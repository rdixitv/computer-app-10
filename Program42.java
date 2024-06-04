/* Program 42
Write a class with the name Volume using function overloading that computes the volume of a cube, a sphere and a cuboid.
04/06/24 */

import java.util.Scanner;

public class Volume {
    static int volume(int s) { // cube
        return s * s * s;
    }

    static double volume(double r) { // sphere
        return (double)4/3 * 3.14 * r * r * r;
    }

    static int volume(int l, int b, int h) { // cuboid
        return l * b * h;
    }

    static double input(String p) {
        Scanner sc = new Scanner(System.in);
        System.out.print(p);
        return sc.nextDouble();
    }

    public static void main(String args[]) {
        int choice = (int)input("Enter choice\n1. Cube\n2. Sphere\n3. Cuboid\n");
        double res = -1;
        switch (choice) {
            case 1:
                int s = (int)input("Enter side length: ");
                res = volume(s);
                break;
            case 2:
                double r = input("Enter radius: ");
                res = volume(r);
                break;
            case 3:
                int l = (int)input("Enter length: ");
                int b = (int)input("Enter breadth: ");
                int h = (int)input("Enter height: ");
                res = volume(l, b, h);
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("The volume is " + res);
    }
}
