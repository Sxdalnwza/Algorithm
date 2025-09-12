import java.util.Scanner;

public class NoteChange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับราคาสินค้า
        System.out.print("Enter price per item: ");
        int price = sc.nextInt();

        // รับจำนวนสินค้า
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // คำนวณยอดที่ต้องจ่าย
        int totalAmount = price * quantity;
        System.out.println("Total amount to pay: " + totalAmount + " baht");

        // กำหนดจำนวนเงินที่ลูกค้ามี (แบงค์พัน 1 ใบ)
        int amountGiven = 1000;
        System.out.println("Customer pays: " + amountGiven + " baht");

        // ตรวจสอบเงินพอหรือไม่
        if (amountGiven < totalAmount) {
            System.out.println("Not enough money!!");
            return; // จบการทำงาน
        }

        // คำนวณเงินทอน
        int change = amountGiven - totalAmount;
        System.out.println("Change is : " + change + " baht");

        // แจกแจงธนบัตรและเหรียญ
        int fiveHundred = change / 500;
        change %= 500;
        int hundred = change / 100;
        change %= 100;
        int fifty = change / 50;
        change %= 50;
        int twenty = change / 20;
        change %= 20;
        int ten = change / 10;
        change %= 10;
        int five = change / 5;
        change %= 5;
        int two = change / 2;
        change %= 2;
        int one = change;

        // แสดงผล
        System.out.println("Five-hundred note: " + fiveHundred + " note(s)");
        System.out.println("Hundred note: " + hundred + " note(s)");
        System.out.println("Fifty note: " + fifty + " note(s)");
        System.out.println("Twenty note: " + twenty + " note(s)");
        System.out.println("Ten coin: " + ten + " coin(s)");
        System.out.println("Five coin: " + five + " coin(s)");
        System.out.println("Two coin: " + two + " coin(s)");
        System.out.println("One coin: " + one + " coin(s)");
    }
}
