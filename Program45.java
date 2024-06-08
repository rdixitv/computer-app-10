/* Program 45
Write a program to enter name, roll number and appropriate values as marks for primary, middle and high school children. Using overloaded functions, calculate and print the averageand percentage scored by the student.
08/06/24 */

import java.util.Scanner;

public class Program45 {
  static double calculate(int s1, int s2, int s3) {
    return (s1 + s2 + s3) / 3.0;
  }

  static double calculate(int s1, int s2, int s3, int s4) {
    return (s1 + s2 + s3 + s4) / 4.0;
  }

  static double calculate(int s1, int s2, int s3, int s4, int s5) {
    return (s1 + s2 + s3 + s4 + s5) / 5.0;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice\n1. Primary school\n2. Middle school\n3. High school");
    int ch = sc.nextInt();
    double res = -1; int s1, s2, s3, s4, s5;
    switch (ch) {
      case 1:
      System.out.println("Enter marks for the three subjects:");
      s1 = sc.nextInt(); s2 = sc.nextInt(); s3 = sc.nextInt();
      res = calculate(s1, s2, s3);
      break;

      case 2:
      System.out.println("Enter marks for the four subjects:");
      s1 = sc.nextInt(); s2 = sc.nextInt(); s3 = sc.nextInt(); s4 = sc.nextInt();
      res = calculate(s1, s2, s3, s4);
      break;

      case 3:
      System.out.println("Enter marks for the five subjects:");
      s1 = sc.nextInt(); s2 = sc.nextInt(); s3 = sc.nextInt(); s4 = sc.nextInt(); s5 = sc.nextInt();
      res = calculate(s1, s2, s3, s4, s5);
      break;

      default:
      System.out.println("Invalid input");
      System.exit(1);
    }

    System.out.println("Average: " + res + "\nPercentage: " + res + "%");
  }
}
