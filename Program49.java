/* Program 49
Design a class to input a string and print the number of spaces;
18/06/24 */

import java.util.Scanner;

public class Program49 {
    static int numSpaces(String s) {
        int c = 0;
        for (int i = -1; i != -1 || c == 0; c++, i = s.indexOf(' ', i + 1));
        return c - 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Number of spaces: " + numSpaces(s));
    }
}
