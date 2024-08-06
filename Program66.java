/* Program 66
06/08/24 */

import java.util.Scanner;

public class Rectangle {
  int length;
  int breadth;
  int perimeter;
  int area;
  float diagonal;

  public void inputdata() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length: ");
    length = sc.nextInt();
    System.out.print("Enter breadth: ");
    breadth = sc.nextInt();
  }

  public void calculate() {
    perimeter = 2 * (length + breadth);
    area = length * breadth;
    diagonal = (float)Math.sqrt(length * length + breadth * breadth);
  }

  public void outputdata() {
    System.out.println("Length\tBreadth\tPerimeter\tArea\tDiagonal\n" + length + "\t" + breadth + "\t" + perimeter + "\t\t" + area + "\t" + diagonal);
  }

  public static void main(String args[]) {
    Rectangle r = new Rectangle();

    r.inputdata();
    r.calculate();
    r.outputdata();
  }
}
