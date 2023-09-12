import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            n = sc.nextInt();

            // Check if n is a positive even number and divisible by 4
            if (n % 4 == 0 && n > 0) {
                total += n; // Add n to the running total
            }
        } while (n % 2 == 0 && n > 0); // Continue while n is a positive even number

        // Print the total of positive numbers that are multiples of 4
        System.out.println("Total = " + total);
    }
}

