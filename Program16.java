/* Program 16
Write a program to input 5 vowels into an array, sort it into ascending order and print it using selection sort.
09/02/24 */

import java.util.Scanner;

public class Program16 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char vowels[] = new char[5];
    int pos;
    char tmp;

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter a vowel: ");
      vowels[i] = sc.next().charAt(0);
    }
    
    for (int i = 0; i < 5; i++) {
      pos = i;
      for (int j = i + 1; j < 5; j++)
        if (vowels[j] < vowels[pos])
          pos = j;

      tmp = vowels[i];
      vowels[i] = vowels[pos];
      vowels[pos] = tmp;
    }
      
    System.out.println("Sorted array:");
    for (int i = 0; i < 5; i++)
      System.out.println(vowels[i]);
  }
}
