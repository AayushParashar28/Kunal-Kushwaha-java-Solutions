import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            int number = 1; // First value in a row is always 1

            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1); // Compute next value
            }

            System.out.println();
        }
    }
}
