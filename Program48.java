/* Program 48
Design a class to input a string and print the number of words in it.
18/06/24 */

import java.util.Scanner;

public class Program48 {
    static int numWords(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            c += s.charAt(i) == ' ' ? 1 : 0;
        }
        return c + 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Number of words: " + numWords(s));
    }
}
