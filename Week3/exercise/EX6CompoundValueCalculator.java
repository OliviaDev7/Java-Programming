
import java.util.Scanner;

public class EX6CompoundValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入每月存款金额
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        // 输入年利率
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // 输入存款月数
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        // 计算月利率
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // 初始化账户余额
        double accountValue = 0;

        // 计算每月复合值
        for (int month = 1; month <= months; month++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        // 输出结果
        System.out.printf("After %d months, the account value is $%.2f%n", months, accountValue);


    }
}

