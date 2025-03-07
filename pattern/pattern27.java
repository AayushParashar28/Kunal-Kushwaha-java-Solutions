import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enterr Number : ");
        int n = s.nextInt();

        int start = 1;
        int end = n * (n + 1);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            int rowCount = n - i;
            int tempStart = start;
            int tempEnd = end - rowCount + 1;
            for (int j = 0; j < rowCount; j++) {
                System.out.print(tempStart++ + " ");
            }
            for (int j = 0; j < rowCount; j++) {
                System.out.print(tempEnd++ + " ");
            }
            start += rowCount;
            end -= rowCount;
            System.out.println();
        }
  }
}
