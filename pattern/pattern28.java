import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enterr Number : ");
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
