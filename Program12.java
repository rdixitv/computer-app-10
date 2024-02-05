/* Program 12
Write a program to initialize an array of 10 numeric elements sorted in ascending order. Accept a value from the user and using binary search, print the index position.
05/02/24 */

import java.util.Scanner;

public class Program12 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, num = 0, l = 0, u = nums.length - 1, m = 0;
    boolean flag = false;
    
    System.out.print("Enter a number to search for: ");
    num = sc.nextInt();

    while (l <= u) {
      m = (l + u) / 2;
      if (num > nums[m])
        l = m + 1;
      else if (num < nums[m])
        u = m - 1;
      else {
        flag = true;
        break;
      }
    }
  
    System.out.println(num + (flag ? " is at pos " + (m + 1) : " is not in the array."));
  }
}
