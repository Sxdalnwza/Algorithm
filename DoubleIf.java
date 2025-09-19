import java.util.Scanner;

public class DoubleIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("จำนวนเต็มบวก");
        }
        else {
            System.out.println("จำนวนเต็มลบ");
        }

        System.out.println("จบโปรแกรม");
    }
}
