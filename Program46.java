/* Program 46
Write a program to overload the function hline(). Ask user if they want:
 1. hline() - Print a line of 30 characters using "-". 
2. hline(int n) - Print a line of 'n' characters using "*"
3. hline(int n, char ch) - Print a line of 'n' characters using character ch
11/06/24 */

import java.util.Scanner;

public class Program46 {
    static void hline(int n, char ch) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    static void hline() {
        hline(30, '-');
    }

    static void hline(int n) {
        hline(n, '*');
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice\n0. no arguments\n1. 1 argument\n2. 2 arguments");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                hline();
                break;
            case 1:
                System.out.print("Enter number of characters: ");
                hline(sc.nextInt());
                break;
            case 2:
                System.out.print("Enter number of characters: ");
                int n = sc.nextInt();
                System.out.print("Enter character: ");
                hline(n, sc.next().charAt(0));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
