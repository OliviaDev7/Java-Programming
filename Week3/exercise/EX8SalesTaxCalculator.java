
import java.util.Scanner;

public class EX8SalesTaxCalculator {
    public static void main(String[] args) {
        // 创建Scanner对象以获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入购买金额
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble(); // 用户输入的购买金额

        // 定义销售税率
        final double TAX_RATE = 0.06; // 销售税率（6%）

        // 计算销售税
        double tax = purchaseAmount * TAX_RATE; // 销售税的计算

        // 显示销售税，保留两位小数
        System.out.printf("Sales tax is $%.2f%n", tax); // 输出格式化的销售税


    }
}

