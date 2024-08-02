/* Program 64
Write a program to declare a class Student with integer data type for rollno string for name and standard and character for section. The class must have functions for input() to accept data from the user, print and the main function to create 3 objects and display their details in a formatted manner.
02/08/24 */


import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    String standard;
    char section;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        rollno = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter standard and section: ");
        standard = sc.next();
        section = sc.next().charAt(0);
    }

    public void print() {
        System.out.println(rollno + "\t" + name + "\t" + standard + "\t\t" + section);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Student 1: ");
        s1.input();

        System.out.println("Student 2: ");
        s2.input();

        System.out.println("Student 3: ");
        s3.input();

        System.out.println("Roll No\tName\tStandard\tSection");
        s1.print();
        s2.print();
        s3.print();
    }
}
