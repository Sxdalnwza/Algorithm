import java.util.Scanner;

public class BMRCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณากรอกเพศ (ชาย/หญิง): ");
        String gender = scanner.nextLine().trim();

        System.out.print("กรอกน้ำหนัก (กิโลกรัม): ");
        double weight = scanner.nextDouble();

        System.out.print("กรอกส่วนสูง (เซนติเมตร): ");
        double height = scanner.nextDouble();

        System.out.print("กรอกอายุ (ปี): ");
        int age = scanner.nextInt();

        double bmr = 0;

        // คำนวณ BMR ตามเพศ
        if (gender.equalsIgnoreCase("ชาย")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender.equalsIgnoreCase("หญิง")) {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            System.out.println("กรอกเพศไม่ถูกต้อง!");
            System.exit(0);
        }

        // แสดงผลลัพธ์
        System.out.println("ค่า BMR ของคุณคือ: " + bmr + " กิโลแคลอรี่/วัน");

        scanner.close();
    }
}
