/* Program 52
Design a class to input a string and print each word on a separate line
21/06/24 */

import java.util.Scanner;

public class Program52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        System.out.println(sc.nextLine().replace(' ', '\n'));
    }
}
