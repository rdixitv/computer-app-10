/* Program 40
Write a program using a menu to add, subtract, multiply and divide 2 numbers. (with arguments and return)
2/3/24 */

import java.util.Scanner;

public class Program40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double n2 = sc.nextDouble();
        System.out.println("Enter operation:\n+: Addition\n-: Subtraction\n*: Multiplication\n/: Division");
        char op = sc.next().charAt(0);
        double res = 0;
        switch (op) {
            case '+':
                res = add(n1, n2);
                break;
            case '-':
                res = subtract(n1, n2);
                break;
            case '*':
                res = multiply(n1, n2);
                break;
            case '/':
                res = divide(n1, n2);
                break;
            default:
                System.out.println("Invalid operation.");
                System.exit(1);
        }
        System.out.println(res);
    }

    static double add(double n1, double n2) {
        return n1 + n2;
    }

    static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    static double divide(double n1, double n2) {
        return n1 / n2;
    }
}
