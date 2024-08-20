/* Program 71
20/8/24 */

import java.util.Scanner;

public class Temperature {
    int max, min;
    double fmax, fmin;

    Temperature(int m1, int m2, double f1, double f2) {
        max = m1;
        min = m2;
        fmax = f1;
        fmin = f2;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max temp (celcius): ");
        max = sc.nextInt();
        System.out.print("Enter min temp (celcius): ");
        min = sc.nextInt();
    }

    void compute() {
        fmax = max * 9.0 / 5 + 32;
        fmin = min * 9.0 / 5 + 32;
    }

    void display() {
        System.out.println("Max temperature (°F): " + fmax + "\nMin temperature (°F): " + fmin);
    }

    public static void main(String args[]) {
        Temperature t = new Temperature(0, 0, 0, 0);
        t.input();
        t.compute();
        t.display();
    }
}
