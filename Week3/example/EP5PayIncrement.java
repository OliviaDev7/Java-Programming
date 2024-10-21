import java.util.Scanner;

public class EP5PayIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = input.nextDouble();
        System.out.println("Your pay without increment is: " + pay); // Display the pay without increment


        System.out.print("Enter your score: ");
        double score = input.nextDouble();


        if (score > 90) {
            pay += pay * 0.03;
        }


        System.out.println("Your pay with increment is: " + pay);


        input.close();
    }
}

