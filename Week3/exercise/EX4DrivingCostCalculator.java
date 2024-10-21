
import java.util.Scanner;

public class EX4DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入驾驶距离
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        // 输入每加仑的燃油效率
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        // 输入每加仑的价格
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // 计算行程的总费用
        double gallonsNeeded = distance / milesPerGallon;  // 计算需要的加仑数
        double totalCost = gallonsNeeded * pricePerGallon; // 计算总费用

        // 输出结果
        System.out.printf("The cost of driving is $%.2f%n", totalCost);

        scanner.close();
    }
}

