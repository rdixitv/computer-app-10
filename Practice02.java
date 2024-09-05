import java.util.Scanner;
class BrooklynBooks {
    String bname;
    double price;
    BrooklynBooks() {
        bname = "";
        price = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        bname = sc.next();
        System.out.print("Enter book price: ");
        price = sc.nextDouble();
    }

    void calculate() {
        price = (price <= 1000 ? 0.98 : price <= 3000 ? 0.9 : 0.85) * price;
    }

    void display() {
        System.out.println("Name: " + bname + "\nPrice: " + price);
    }

    public static void main(String args[]) {
        BrooklynBooks b = new BrooklynBooks();
        b.input();
        b.calculate();
        b.display();
    }
}
