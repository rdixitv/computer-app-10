/* Program 55
Design a class to input a name and print only the initials.
25/06/24 */

import java.util.Scanner;

public class Program55 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = " " + sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) == ' ' ? name.charAt(i + 1) : "");
        }
    }
}
