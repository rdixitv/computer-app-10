/* Program 58
Design a class to input a string and find the frequency of a word present in the string.
28/06/24 */

import java.util.Scanner;

public class Program58 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = " " + sc.nextLine().toLowerCase() + " ";
        System.out.print("Enter word: ");
        String w = " " + sc.next().toLowerCase() + " ";
        int f = 0, i = s.indexOf(w, 0);
        while (i != -1) {
            f++;
            i = s.indexOf(w, i + 1);
        }

        System.out.println(f);
    }
}
