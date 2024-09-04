import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = s.nextInt();

        int ans = checkNumber(n);
        if (n == ans) {
            System.out.println("The " + n + " is a Perfect Number");
        } else {
            System.out.println("The " + n + " is a Perfect Number");
        }

    }

    static int checkNumber(int n){
        int sum = 0 ;
        int i = 1 ;
        while(i <= n/2){
            if(i%n==0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
}
