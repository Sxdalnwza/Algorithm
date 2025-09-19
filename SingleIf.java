import java.util.Scanner;

public class SingleIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        scanner.close();
    }
}
