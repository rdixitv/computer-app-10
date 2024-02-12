/* Program 19
Write a program to enter 10 characters into a character array and sort the array using bubble sort and print in ascending order.
12/02/24 */

import java.util.Scanner;

public class Program19 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char arr[] = new char[10], tmp;

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter character " + (i + 1) + ": ");
      arr[i] = sc.next().charAt(0);
    }

    for (int i = 0; i < 10; i++)
      for (int j = 0; j < 9 - i; j++)
        if (arr[j] > arr[j + 1]) {
          tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
  
    System.out.println("Sorted array: ");
    for (int i = 0; i < 10; i++)
      System.out.println(arr[i]);
  }
}
