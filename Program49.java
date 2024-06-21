/* Program 49
Design a class to input a string and print the number of spaces;
18/06/24 */

import java.util.Scanner;

public class Program49 {
    static int numSpaces(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            c += s.charAt(i) == ' ' ? 1 : 0;
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        System.out.println("Number of spaces: " + numSpaces(sc.nextLine()));
    }
}
