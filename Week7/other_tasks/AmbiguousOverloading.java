public class AmbiguousOverloading {
    public static void main(String[] args) {
        System.out.println(max(1, 2.0)); // 调用 max(int, double)
        System.out.println(max(2.0, 1)); // 调用 max(double, int)
    }

    public static double max(int num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
