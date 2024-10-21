
import java.util.Scanner;

public class EX5HexagonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入六边形的边长
        System.out.print("Enter the length of the side: ");
        double sideLength = scanner.nextDouble();

        // 计算六边形的面积
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        // 输出结果
        System.out.printf("The area of the hexagon is %.4f%n", area);


    }
}

