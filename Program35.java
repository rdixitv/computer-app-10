/* Program 35
Write a program using a menu to add, subtract, multiply and divide 2 numbers.
24/2/23 */

import java.util.Scanner;
public class Program35 {
  public static void main(String[] args) {
    operate();
 } 

  static void operate() {
    Scanner sc = new Scanner(System.in);
    char op;
    double n1, n2, res = -1;
    System.out.print("Enter 1st number: ");
    n1 = sc.nextDouble();
    System.out.println("Enter operation:\n+: Addition\n-: Subtraction\n*: Multiplication\n/: Division");
    op = sc.next().charAt(0);
    System.out.print("Enter 2nd number: ");
    n2 = sc.nextDouble();

   switch (op) {
      case '+':
        res = n1 + n2;
        break;
      case '-':
        res = n1 - n2;
        break;
      case '*':
        res = n1 * n2;
        break;
      case '/':
        res = n1 / n2;
        break;
      default:
        System.out.println("Invalid operation");
        System.exit(1);
    }
    System.out.println(n1 + " " + op + " " + n2 + " = " + res);
  }
}
