/* Program 41
Write a complete Java program that invokes a function satis() to find whether four integers a, b, c, d sent to satis() satisfy the equation 3a + 3b + 3c = 3d or not. The function satis returns 0 if the above situation is satisfied with the given four numbners and returns -1 otherwise.
04/06/24 */

import java.util.Scanner;

public class Program41 {
    static int satis(int a, int b, int c, int d) {
        return a + b + c == d ? 0 : -1;
    }

    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    public static void main(String args[]) {
        int a = input(), b = input(), c = input(), d = input();
        System.out.println("The equation is " + (satis(a, b, c, d) == -1 ? "not " : "") + "satisfied.");
    }
}
