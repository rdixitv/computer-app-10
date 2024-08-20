/* Program 72
20/08/24 */

import java.util.Scanner;

public class Student {
    String name;
    int age, m1, m2, m3, maximum;
    float average;

    Student(String n, int a, int s1, int s2, int s3, int m, float avg) {
        name = n;
        age = a;
        m1 = s1;
        m2 = s2;
        m3 = s3;
        maximum = m;
        average = avg;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter marks of 3 subjects: ");
        m1 = sc.nextInt(); m2 = sc.nextInt(); m3 = sc.nextInt();
    }

    void compute() {
        maximum = Math.max(Math.max(m1, m2), m3);
        average = (m1 + m2 + m3) / 3.0f;
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nMarks: " + m1 + ", " + m2 + ", " + m3 + "\nMaximum: " + maximum + "\nAverage: " + average);
    }

    public static void main(String args[]) {
        Student s = new Student("", 0, 0, 0, 0, 0, 0);
        s.input();
        s.compute();
        s.display();
    }
}
