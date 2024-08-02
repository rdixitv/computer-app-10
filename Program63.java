/* Program 63
Write a program to declare a class Student with integer data type for roll no. string for name and standard and character for section. The class must have functions for input (assign values) , print() and the main function to create an object and to call the functions.
02/08/24 */

import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    char section;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        rollno = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter section: ");
        section = sc.next().charAt(0);
    }

    public void print() {
        System.out.println("Roll no: " + rollno + "\nName: " + name + "\nSection: " + section);
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.input();
        s.print();
    }
}
