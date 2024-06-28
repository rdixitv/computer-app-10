/* Program 57
Design a class to input a string and print the total number of uppercase letters, lowercase letters, digits and special characters.
28/06/24 */

import java.util.Scanner;

public class Program57 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int c[] = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch) c[0]++;
            else if (Character.isLowerCase(ch)) c[1]++;
            else if (Character.isDigit(ch)) c[2]++;
            else c[3]++;
        }

        System.out.println("Uppercase: " + c[0] + "\nLowercase: " + c[1] + "\nDigits: " + c[2] + "\nSpecial characters: " + c[3]);
    }
}
