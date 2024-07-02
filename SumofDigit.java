import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        int ans = digitsum(n);
        System.out.println("The sum of " + n + " is " + ans);

    }

    static int digitsum(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10 ;
            n = n/ 10;
        }
        return sum ;
    }
}
