import java.util.Scanner;


public class RSTODOLLAR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Rs : ");
        int n = s.nextInt();

        int usd = n / 85 ;

        System.out.println("Your Dollar is :" + usd);
    }
}
