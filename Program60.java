/* Program 60
Design a class to input a string and display the total number of consonants in it.
29/6/24 */

import java.util.Scanner;

public class Program60 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        int n = 0;
        for (int i = 0; i < s.length(); i++)
            n += Character.isLetter(s.charAt(i)) && "aeiou".indexOf(s.charAt(i)) == -1 ? 1 : 0;

        System.out.println(n);
    }
}
