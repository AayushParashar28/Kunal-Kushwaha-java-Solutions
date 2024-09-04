import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        checkarmstrong();
    }

    static void checkarmstrong() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = s.nextInt();
        int num = n;
        int rem, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if (sum == n) {
            System.out.println(n + " is Armstrong Number");
        } else {
            System.out.println(n + " is not Arstrong Number");
        }
    }
}
