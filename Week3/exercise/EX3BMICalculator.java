
import java.util.Scanner;

public class EX3BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入体重（磅）
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // 输入身高（英寸）
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        // 将体重转换为千克
        double weightKilograms = weightPounds * 0.45359237;

        // 将身高转换为米
        double heightMeters = heightInches * 0.0254;

        // 计算BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // 输出结果
        System.out.printf("BMI is %.4f%n", bmi);


    }
}
