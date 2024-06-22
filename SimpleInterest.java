import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal :");
        int p = s.nextInt();
        System.out.println("Enter Time :");
        int t = s.nextInt();
        System.out.println("Enter Rate :");
        int r = s.nextInt();


        int SI = (p * r * t)/100;

        System.out.println("The Simple Interest is :" + SI);
    }
}
