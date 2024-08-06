/* Program 65
Write a program to declare a class Student with integer data type for roll number, string for name and standard and char for section. The class must have functions for input with parameters, print and the main funciton to create an object and display its details in a formatted manner.
06/08/24 */

import java.util.Scanner;

public class Student {
  int roll;
  String name;
  String standard;
  char section;

  public void input(int r, String n, String st, char se) {
    roll = r;
    name = n;
    standard = st;
    section = se;
  }

  public void print() {
    System.out.println("Roll No\tName\tGrade\tSection\n" + roll + "\t" + name + "\t" + standard + "\t" + section);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Student s = new Student();

    System.out.print("Enter roll no: ");
    int r = sc.nextInt();
    System.out.print("Enter name: ");
    String n = sc.next();
    System.out.print("Enter standard: ");
    String st = sc.next();
    System.out.print("Enter section: ");

    s.input(r, n, st, sc.next().charAt(0));
    s.print();
  }
}
