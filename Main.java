import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าตัวเลข 2 ค่า
        System.out.print("ป้อนตัวเลขตัวที่ 1: ");
        int num1 = scanner.nextInt();

        System.out.print("ป้อนตัวเลขตัวที่ 2: ");
        int num2 = scanner.nextInt();

        int result;

        if (num1 > num2) {
            result = num1 - num2;
            System.out.println("ผลลัพธ์ = " + result);
        } else if (num1 < num2) {
            result = num1 + num2;
            System.out.println("ผลลัพธ์ = " + result);
        } else {
            System.out.println("ตัวเลขทั้งสองเท่ากัน ไม่มีการคำนวณ");
        }

        scanner.close();
    }
}
