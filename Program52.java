/* Program 52
Design a class to input a string and print each word on a seaparate line
21/06/24 */

import java.util.Scanner;

public class Program52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(s.replace(' ', '\n'));
    }
}
