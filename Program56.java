/* Program 56
Design a class to input a word and print whether it is a palindrome.
25/06/24 */

import java.util.Scanner;

public class Program56 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        boolean isPalindrome = true;
        for (int i = 0; i < w.length() / 2; i++) {
            if (w.charAt(i) != w.charAt(w.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(w + " is" + (isPalindrome ? " " : " not ") + "a palindrome.");
    }
}
