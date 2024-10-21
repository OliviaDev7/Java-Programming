public class Switch {
    public static void main(String[] args) {
        int a = 3; // 初始化 a
        int x = a; // 将 x 初始化为 a 的值

        // 使用 switch 语句来替代 if-else
        switch (a) {
            case 3:
                x += 16; // 如果 a 是 3，x 加 16
                break;
            case 2:
                x += 34; // 如果 a 是 2，x 加 34
                break;
            default:
                x += 5; // 其他情况，x 加 5
                break;
        }

        System.out.println("Final value of x using switch: " + x); // 输出最终 x 的值
    }
}

