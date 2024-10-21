import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day number (0-6): ");
        int day = input.nextInt();

        switch (day) {
            case 0:
            case 6:
                System.out.println("Weekend");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 0 and 6."); // Handle invalid input
                break;
        }


    }
}

