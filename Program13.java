/* Program 13
Write a program to initialize a sorted array of 10 strings. Accept a string value from the user and using binary search. Print the position of the string in the array.
05/02/24 */

import java.util.Scanner;

public class Program13 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String strs[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, str = "";
    int  l = 0, u = strs.length - 1, m = 0;
    boolean flag = false;
    
    System.out.print("Enter a string to search for: ");
    str = sc.next();

    while (l <= u) {
      m = (l + u) / 2;
      if (str.compareTo(strs[m]) > 0)
        l = m + 1;
      else if (str.compareTo(strs[m]) < 0)
        u = m - 1;
      else {
        flag = true;
        break;
      }
    }
  
    System.out.println(str + (flag ? " is at pos " + (m + 1) : " is not in the array."));
  }
}
