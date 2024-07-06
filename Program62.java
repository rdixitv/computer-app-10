/* Program 62
Design a class to input a string in uppercase and display the string such that the first letter of each word is uppercase and the others are lowercase.
06/07/24 */

import java.util.Scanner;

public class Program62 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string in uppercase: ");
        String s = " " + sc.nextLine().toUpperCase() + " ";
        String res = "";
        int i = 0;
        while (i != -1 && i != s.length() - 1) {
            res += " " + s.charAt(i + 1) + s.substring(i + 2, i = s.indexOf(' ', i + 1)).toLowerCase();
        }
        System.out.println(res.trim());
    }
}
