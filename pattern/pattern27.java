import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enterr Number : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j == n - i - 1 || j == n + i - 1 || (i == 1 && (j == n - 2 || j == n || j == n + 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
  }
}
