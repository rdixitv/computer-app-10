/* Program 51
Design a class to input a string and print the total number of individual vowels.
21/06/24 */

import java.util.Scanner;

public class Program51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        int counts[] = {0, 0, 0, 0, 0};
        for (int i = 0; i < s.length(); i++) {
            int n = "aeiou".indexOf(s.charAt(i));
            if (n != -1) {
                counts[n]++;
            }
        }

        System.out.println("Number of vowels:\na: " + counts[0] + "\ne: " + counts[1] + "\ni: " + counts[2] + "\no: " + counts[3] + "\nu: " + counts[4]);
    }
}
