/* Program 20
Write a program to enter 10 countries and capitals into two single dimensional arrays. Enter the value of a country and print its corresponding capital.
12/02/24
 */

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String countries[] = new String[10], country;
       String capitals[] = new String[10];
       int i;
       boolean flag = false;

       for (i = 0; i < 10; i++) {
           System.out.print("Enter a country: ");
           countries[i] = sc.next();
           System.out.print("Enter its capital: ");
           capitals[i] = sc.next();
       }

       System.out.print("Enter the country to search for: ");
       country = sc.next();

       for (i = 0; i < 10; i++)
           if (countries[i].equals(country)) {
               flag = true;
               break;
           }

       System.out.println(flag ? "Capital: " + capitals[i] : "Invalid country");
    }
}
