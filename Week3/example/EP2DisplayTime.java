
import java.util.Scanner;
public class EP2DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Prompt user for input
        System.out.print(" Enter an integer for seconds:");
        int seconds = input.nextInt();

        int minutes = seconds / 60;// Find minutes in seconds
        int remainingSeconds = seconds % 60;//Seconds remaining
        System.out.print(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds ");
    }
}
