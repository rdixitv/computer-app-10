/* Program 75
27/08/24 */

import java.util.Scanner;

class Student {
  int no1, no2, no3, sum;

  Student() {
    no1 = 0;
    no2 = 0;
    no3 = 0;
    sum = 0;
  }

  Student(int n1, int n2, int n3) {
    no1 = n1;
    no2 = n2;
    no3 = n3;
  }

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers: ");
    no1 = sc.nextInt();
    no2 = sc.nextInt();
    no3 = sc.nextInt();
  }

  void compute() {
    sum = no1 + no2 + no3;
  }

  void display() {
    System.out.println("The sum is " + sum);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();
    s1.input();
    s1.compute();
    s1.display();
    System.out.println("Enter 3 numbers: ");
    Student s2 = new Student(sc.nextInt(), sc.nextInt(), sc.nextInt());
    s2.compute();
    s2.display();
  }
}
