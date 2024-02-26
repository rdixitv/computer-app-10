/* Program 36
Write a program using a menu to add, subtract, multiply and divide 2 numbers.
26/2/24 */

import java.util.Scanner;

public class Program36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation:\n+: Addition\n-: Subtraction\n*: Multiplication\n/: Division");
        char op = sc.next().charAt(0);
        String res = "";
        switch (op) {
            case '+':
                res = "Sum: " + add();
                break;
            case '-':
                res = "Differnece: " + subtract();
                break;
            case '*':
                res = "Product: " + multiply();
                break;
            case '/':
                res = "Quotient: " + divide();
                break;
            default:
                System.out.println("Invalid operator.");
                System.exit(1);
        }
        System.out.println(res);
    }
    
    static double[] in() {
        Scanner sc = new Scanner(System.in);
        double nums[] = new double[2];
        System.out.print("Enter 1st number: ");
        nums[0] = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        nums[1] = sc.nextDouble();
        return nums;
    }

    static double add() {
       double nums[] = in(); 
       return nums[0] + nums[1];
    }

    static double subtract() {
        double nums[] = in();
        return nums[0] - nums[1];
    }

    static double multiply() {
        double nums[] = in();
        return nums[0] * nums[1];
    }

    static double divide() {
        double nums[] = in();
        return nums[0] / nums[1];
    }
}
