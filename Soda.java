import java.util.Scanner;

public class Soda {
    public static void main(String args[]) {
        // int money
        // int tax
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money ");
        int money = scanner.nextInt();
        System.out.print("Enter tax ");
        int tax = scanner.nextInt();
        int total = money * tax;
        System.out.println("total is = " + total);
    }
}