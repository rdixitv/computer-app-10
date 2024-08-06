/* Program 68
06/08/24 */

import java.util.Scanner;

public class Telephone {
  int prv;
  int pre;
  int call;
  String name;
  double amt;
  double total;

  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter previous reading: ");
    prv = sc.nextInt();
    System.out.print("Enter present reading: ");
    pre = sc.nextInt();
    System.out.print("Enter name: ");
    name = sc.next();
    call = pre - prv;
  }

  public void cal() {
    if (call <= 100) {
      amt = 0;
    } else if (call <= 200) {
      amt = (call - 100) * 0.9;
    } else if (call <= 400) {
      amt = 100 * 0.9 + (call - 200) * 0.8; 
    } else {
      amt = 100 * 0.9 + 200 * 0.8 + (call - 400) * 0.7;
    }

    total = amt + 180;
  }

  public void display() {
    System.out.printf("Name of the customer\tCalls Made\tAmount to be Paid\n%s\t\t\t%d\t\t%f\n", name, call, amt);
  }

  public static void main(String args[]) {
    Telephone t = new Telephone();

    t.input();
    t.cal();
    t.display();
  }
}
