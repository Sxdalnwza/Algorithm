import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับคะแนนสอบกลางภาค
        System.out.print("Enter your midterm score: ");
        int midtermScore = input.nextInt();

        // รับคะแนนสอบปลายภาค
        System.out.print("Enter your final score: ");
        int finalScore = input.nextInt();

        // คำนวณคะแนนรวม
        int totalScore = midtermScore + finalScore;

        // แสดงคะแนนรวม
        System.out.println("Your total score is " + totalScore + " .");

        // ตรวจสอบผลลัพธ์ว่าผ่านหรือไม่
        if (totalScore >= 50) {
            System.out.println("The result is Pass!!");
        } else {
            System.out.println("The result is Fail!!");
        }

        input.close();
    }
}
