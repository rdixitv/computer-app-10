/* Program 35
Write a program using a menu to add subtract and divide 2 numbers.
24/2/23 */

import java.util.Scanner;
public class Program35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char op;
    double n1, n2, res;
    System.out.print("Enter 1st number: ");
    n1 = sc.nextDouble();
    System.out.println("Enter operation:\n1. Addition\n2. Subtraction\n3. Division");
    op = sc.next().charAt(0);
    System.out.print("Enter 2nd number: ");
    n2 = sc.nextDouble();

    res = operate(op, n1, n2);
    System.out.println(n1 + " " + (op >= 49 ? (char)(op * 2 - 55) : op) + " " + n2 + " = " + res);
 } 

  static double operate(char op, double n1, double n2) {
    switch (op) {
      case '1': case '+':
        return n1 + n2;
      case '2': case '-':
        return n1 - n2;
      case '3': case '/':
        return n1 / n2;
      default:
        System.out.println("Invalid operation");
        System.exit(1);
    }
    return 0;
  }
}
