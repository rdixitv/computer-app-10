/* Program 54
Design a class to input a string and replace every 'e' with * and print the new string.
25/06/24 */

import java.util.Scanner;

public class Program54 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        System.out.println(sc.next().replace('e', '*'));
    }
}
