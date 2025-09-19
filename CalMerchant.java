import java.util.Scanner;

public class CalMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับราคาต่อชิ้น
        System.out.print("Enter the price of the product (per unit): ");
        double pricePerUnit = sc.nextDouble();

        // รับจำนวนสินค้า
        System.out.print("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        // คำนวณราคารวม
        double totalPrice = pricePerUnit * quantity;

        // ถ้าซื้อ 10 ชิ้นขึ้นไปให้ส่วนลด 10%
        if (quantity >= 10) {
            System.out.println("You get a 10% discount!");
            totalPrice = totalPrice * 0.90; // ลด 10%
        }

        // แสดงราคารวม
        System.out.println("Total price: " + totalPrice + " Baht");
    }
}
