
import java.util.Scanner;

public class EX2TipsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入小计和小费率
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        // 计算小费
        double gratuity = subtotal * (gratuityRate / 100);

        // 计算总金额
        double total = subtotal + gratuity;

        // 输出结果
        System.out.printf("The gratuity is $%.1f and total is $%.1f%n", gratuity, total);

        scanner.close();
    }
}
