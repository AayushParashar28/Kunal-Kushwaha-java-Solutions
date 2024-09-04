import java.util.Scanner;

public class SubtracttheProductandSumofInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long product = 1;
        long sum = 0;
        while(n > 0){
           sum += n % 10 ;
           product *= n % 10;
           n = n/10; 
        }

        int diff = (int)(product - sum);
        System.out.println(diff);
    }
}
