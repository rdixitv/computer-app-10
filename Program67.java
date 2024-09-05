/* Program 67
06/08/24 */

import java.util.Scanner;

public class Increment {
  String name;
  double basic;
  int age;

  void getdata(String n, double b, int a) {
    name = n;
    basic = b;
    age = a;
  }

  public void calculate() {
    basic *= age >= 50 ? 1.2 : age > 45 ? 1.15 : 1.1;
  }

  public void display() {
    System.out.println("Name\tAge\tUpdated Basic\n" + name + "\t" + age + "\t" + basic);
  }

  public static void main(String args[]) {
    Increment i = new Increment();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name: ");
    String n = sc.next();
    System.out.print("Enter basic: ");
    double b = sc.nextDouble();
    System.out.print("Enter age: ");

    
    i.getdata(n, b, sc.nextInt());
    i.calculate();
    i.display();
  }
}
