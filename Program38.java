/* Program 38
Write a program using a menu to add, subtract, multiply and divide 2 numbers. (with arguments, without return)
1/3/24 */

import java.util.Scanner;

public class Program38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        double n2 = sc.nextInt();
        System.out.println("Enter operation:\n+: Addition\n-: Subtraction\n*: Multiplication\n/: Division");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                add(n1, n2);
                break;
            case '-':
                subtract(n1, n2);
                break;
            case '*':
                multiply(n1, n2);
                break;
            case '/':
                divide(n1, n2);
                break;
            default:
                System.out.println("Invalid operation.");
                System.exit(1);
        }
    }

    static void add(double n1, double n2) {
        System.out.println("Sum: " + (n1 + n2));
    }

    static void subtract(double n1, double n2) {
        System.out.println("Difference: " + (n1 - n2));
    }

    static void multiply(double n1, double n2) {
        System.out.println("Product: " + (n1 * n2));
    }

    static void divide(double n1, double n2) {
        System.out.println("Quotient: " + (n1 / n2));
    }
}
