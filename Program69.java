/* Program 69
13/8/24 */

import java.util.Scanner;

public class Factorial {
    int a;

    Factorial() {
        a = 0;
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
        Factorial f = new Factorial();
        System.out.print("Enter number: ");
        f.input(sc.nextInt());
        f.display();
    }
}
