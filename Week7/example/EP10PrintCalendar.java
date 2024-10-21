
import java.util.Scanner;
        import java.util.Calendar;

public class EP10PrintCalendar {

    public static void main(String[] args) {
        int year = getYearInput();
        int month = getMonthInput();

        printCalendarHeader(year, month);
        printDays(year, month);
    }

    // 获取年份输入
    private static int getYearInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        return scanner.nextInt();
    }

    // 获取月份输入
    private static int getMonthInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month as number between 1 and 12: ");
        return scanner.nextInt();
    }

    // 打印日历头部
    private static void printCalendarHeader(int year, int month) {
        String monthName = getMonthName(month);
        System.out.printf("%s %d%n", monthName, year);
        System.out.println("---------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    // 获取月份名称
    private static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return monthNames[month - 1]; // month - 1 以匹配数组索引
    }

    // 打印每个月的日期
    private static void printDays(int year, int month) {
        int numberOfDays = getNumberOfDays(year, month);
        int startDay = getStartDay(year, month);

        // 打印前导空格
        for (int i = 1; i < startDay; i++) {
            System.out.print("    "); // 每天占 4 个空格
        }

        // 打印每个月的日期
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day); // 打印日期，每个日期占 4 个字符宽度
            if ((day + startDay - 1) % 7 == 0) { // 星期六后换行
                System.out.println();
            }
        }
        System.out.println(); // 打印结束后换行
    }

    // 获取指定年份和月份的天数
    private static int getNumberOfDays(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // month - 1 因为 Calendar 的月份是从 0 开始的
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 返回该月份的最大天数
    }

    // 获取该月份的起始天
    private static int getStartDay(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // 设置为该月份的第一天
        return cal.get(Calendar.DAY_OF_WEEK); // 获取星期几（1 = 星期日，2 = 星期一，...）

    }
}