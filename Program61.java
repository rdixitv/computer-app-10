/* Program 61
Design a class to input a string and display the ascii codes of each of the characters of the string.
02/07/24 */

import java.util.Scanner;

public class Program61 {
    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print((int)s.charAt(i) + " ");
        }
    }
}
