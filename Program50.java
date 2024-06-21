/* Program 50
Design a class to input a string and print the total number of vowels in it.
21/06/24 */

import java.util.Scanner;

public class Program50 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter string: ");
       String s = sc.nextLine().toLowerCase();
       int n = 0;
       for (int i = 0; i < s.length(); i++) {
           if ("aeiou".indexOf(s.charAt(i)) != -1)
               n++;
       }
       System.out.println("Number of vowels: " + n);
    }
}
