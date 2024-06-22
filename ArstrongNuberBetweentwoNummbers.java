import java.util.Scanner;

public class ArstrongNuberBetweentwoNummbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first Number :");
        int n1 = s.nextInt();
        System.out.print("Enter Second Number :");
        int n2 = s.nextInt();

        for (int i = n1; i < n2; i++) {
            int rem, check, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println(sum + "is a Armstrong Number");
            }
        }

    }
}
