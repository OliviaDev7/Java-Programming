import java.util.Scanner;  // 导入Scanner类用于输入
import java.util.Random;   // 导入Random类用于生成随机数

public class EX9LotteryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于获取用户输入
        Random rand = new Random();              // 创建Random对象用于生成随机彩票号码

        // 生成一个随机的两位数彩票号码
        int lotteryNumber = rand.nextInt(90) + 10; // 生成10到99之间的随机数

        System.out.print("Enter your lottery pick (two digits): ");
        int userPick = input.nextInt(); // 获取用户输入的两位数

        // 将用户输入格式化为两位数
        String formattedUserPick = String.format("%02d", userPick);
        String formattedLotteryNumber = String.format("%02d", lotteryNumber);

        System.out.println("The lottery number is " + formattedLotteryNumber);

        // 检查是否完全匹配
        if (formattedUserPick.equals(formattedLotteryNumber)) {
            System.out.println("Exact match: you win $10,000");
        } else {
            // 检查数字匹配
            char userFirstDigit = formattedUserPick.charAt(0);
            char userSecondDigit = formattedUserPick.charAt(1);
            char lotteryFirstDigit = formattedLotteryNumber.charAt(0);
            char lotterySecondDigit = formattedLotteryNumber.charAt(1);

            // 检查是否有一个数字匹配
            if (userFirstDigit == lotteryFirstDigit || userFirstDigit == lotterySecondDigit ||
                    userSecondDigit == lotteryFirstDigit || userSecondDigit == lotterySecondDigit) {
                System.out.println("Match one digit: you win $1,000");
            }
            // 检查是否反向匹配
            else if (userFirstDigit == lotterySecondDigit && userSecondDigit == lotteryFirstDigit) {
                System.out.println("Match all digits: you win $3,000");
            } else {
                System.out.println("Sorry: no match");
            }
        }

        input.close(); // 关闭Scanner以释放资源
    }
}
