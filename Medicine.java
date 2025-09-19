import java.util.Scanner;

public class Medicine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกอายุของผู้ใช้ (ปี): ");
        double age = scanner.nextDouble(); // ใช้ double เผื่อกรณีอายุน้อยกว่า 1 ปี

        if (age <= 0) {
            System.out.println("wrong age");
        } else if (age > 10) {
            System.out.println("รับประทานครั้งละ 2 ช้อนชา");
        } else if (age >= 3 && age <= 10) {
            System.out.println("รับประทานครั้งละ 1 ช้อนชา");
        } else if (age >= 1 && age < 3) {
            System.out.println("รับประทานครั้งละ 1/2 ช้อนชา");
        } else {
            System.out.println("ห้ามรับประทาน");
        }

        scanner.close();
    }
}
