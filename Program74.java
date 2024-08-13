/* Program 74
13/8/24 */

import java.util.Scanner;

public class Factorial {
    int a;

    Factorial() {
        a = 0;
    }

    Factorial(int b) {
        a = b;
    }

    void input(int m) {
        a = m;
    }

    void display() {
        long res = 1;
        for (int i = 2; i <= a; i++) {
            res *= i;
        }
        System.out.println("Factorial: " + res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Factorial f1 = new Factorial();
        System.out.print("Enter number 1: ");
        f1.input(sc.nextInt());
        f1.display();
        System.out.print("Enter number 2: ");
        Factorial f2 = new Factorial(sc.nextInt());
        f2.display();
    }
}
