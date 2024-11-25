import java.util.Scanner;

public class GuessNumberLowerOrHigher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        int ans = guessNumber(n ,  s);
        System.out.println("Number is " + ans);
    }

    public static int guessNumber(int n, Scanner s) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("Is your number " + mid + "?");
            System.out.print("Enter '1' if my guess is too high, '2' if too low, '0' if correct: ");
            int response = s.nextInt();
            if (response == 0) {
                return mid;
            } else if (response == 1) {
                end = mid - 1;
            } else if (response == 2) {
                start = mid + 1;
            }
            else {
                System.out.println("Invalid input. Please enter '0', '1', or '2'.");
            }
        }
        return -1;
    }
}