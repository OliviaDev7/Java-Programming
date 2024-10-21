import java.util.Scanner;

public class EX2GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入第一个整数
        System.out.print("Enter first integer: ");
        int firstInteger = scanner.nextInt();

        // 提示用户输入第二个整数
        System.out.print("Enter second integer: ");
        int secondInteger = scanner.nextInt();

        // 计算并显示两个整数的最大公约数
        int gcd = calculateGCD(firstInteger, secondInteger);
        System.out.printf("The greatest common divisor for %d and %d is %d%n", firstInteger, secondInteger, gcd);
    }

    // 计算最大公约数的方法
    public static int calculateGCD(int a, int b) {
        // 使用欧几里得算法计算最大公约数
        while (b != 0) {
            int temp = b;
            b = a % b; // 计算余数
            a = temp;  // 更新 a
        }
        return a; // 返回最大公约数
    }
}

