/* Program 43
Write a class with an overloaded function compare() as follows:
void compare(int, int) - to compare 2 integers and print the greater of the 2 integers
void compare(char, char) - to compare the numeric value of 2 charaters and print the one with a higher numeric value.
void compare(String, String) - to compare the length of 2 strings and print the longer of the 2.
08/06/24 */

import java.util.Scanner;

public class Program43 {
    static void compare(int n1, int n2) {
        System.out.println(Math.max(n1, n2));
    }

    static void compare(char c1, char c2) {
        System.out.println((char)Math.max(c1, c2));
    }
    
    static void compare(String s1, String s2) {
        System.out.println(s1.length() > s2.length() ? s1 : s2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice\n1. int\n2. char\n3. String");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter 2 integers:");
                int n1 = sc.nextInt(), n2 = sc.nextInt();
                compare(n1, n2);
                break;
            case 2:
                System.out.println("Enter 2 characters:");
                char c1 = sc.next().charAt(0), c2 = sc.next().charAt(0);
                compare(c1, c2);
                break;
            case 3:
                System.out.println("Enter 2 strings:");
                String s1 = sc.next(), s2 = sc.next();
                compare(s1, s2);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
