/* Program 39
Write a program to pass 2 int values to a function such that the first number is lower than the second number. The integer values will be the range and the function returns the sum of the numbers in the range.
1/3/24 */

import java.util.Scanner;

public class Program39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower number: ");
        int l = sc.nextInt();
        System.out.print("Enter higher number: ");
        int u = sc.nextInt();

        System.out.println("Sum: " + sum(l, u));
    }

    static int sum(int l, int u) {
        int sum = 0;
        for (int i = l; i <= u; i++)
            sum += i;
        return sum;
    }
}
