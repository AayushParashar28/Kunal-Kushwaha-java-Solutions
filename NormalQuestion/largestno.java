import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        if (n > m) {
            System.out.println("N is the largest Number");
        } else {
            System.out.println("M is the largest Number");
        }
    }
}
