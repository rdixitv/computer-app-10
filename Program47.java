/* Program 47
Design a class to input a string and print the letters on separate lines.
18/06/24 */

import java.util.Scanner;

public class Program47 {
    static void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        print(s);
    }
}
