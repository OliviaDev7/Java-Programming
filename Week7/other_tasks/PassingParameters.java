
public class PassingParameters {

    // 方法：打印消息 n 次
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message); // 使用 println 打印消息并换行
        }
    }

    public static void main(String[] args) {
        // 示例调用 1
        nPrintln("Welcome to Java", 5); // 打印消息 5 次

        // 示例调用 2
        nPrintln("Computer Science", 15); // 打印消息 15 次
    }
}
