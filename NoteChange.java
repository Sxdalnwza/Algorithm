import java.util.Scanner;

public class NoteChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // สมมุติว่าเรามีเงิน 1000 บาท
        int totalMoney = 1000;

        // รับจำนวนเงินที่ต้องจ่าย
        System.out.print("Enter amount to pay: ");
        int amountToPay = input.nextInt();

        // คำนวณเงินทอน
        int change = totalMoney - amountToPay;
        System.out.println("Change is : " + change + " baht");

        // ธนบัตรและเหรียญที่ใช้ทอนได้ (เพิ่ม 1 บาท)
        int[] denominations = { 500, 100, 50, 20, 10, 5, 2, 1 };
        String[] labels = {
                "Five-hundred note",
                "Hundred note",
                "Fifty note",
                "Twenty note",
                "Ten coin",
                "Five coin",
                "Two coin",
                "One coin"
        };

        // คำนวณจำนวนแต่ละประเภทของธนบัตรและเหรียญ
        for (int i = 0; i < denominations.length; i++) {
            int count = change / denominations[i];
            change = change % denominations[i];
            System.out.println(labels[i] + ": " + count + " " + (count > 1 ? "note(s)/coin(s)" : "note(s)/coin(s)"));
        }

        input.close();
    }
}
