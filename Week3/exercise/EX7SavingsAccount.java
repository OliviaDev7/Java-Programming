
import java.util.Scanner;

public class EX7SavingsAccount {
    public static void main(String[] args) {
        // 常量
        final double INTEREST_RATE = 0.05; // 年利率（5%）
        final int MONTHS = 6; // 计算的月份数

        // 创建Scanner对象以获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入每月存款金额
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        // 初始化账户余额为零
        double accountValue = 0.0;

        // 计算六个月后的账户余额
        for (int month = 1; month <= MONTHS; month++) {
            // 将每月存款加到账户余额并应用每月利息
            accountValue = (accountValue + monthlySaving) * (1 + INTEREST_RATE / 12);
        }

        // 显示结果，保留两位小数
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);

        // 关闭Scanner
        scanner.close();
    }
}

