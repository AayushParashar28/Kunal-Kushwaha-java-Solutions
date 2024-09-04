import java.util.Scanner;

public class factorialprogramfunction {

    static int fact(int num){
        int fact = 1 ;
        for(int i = 1 ; i<=num ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = fact(n);
        System.out.println("Tha factorial of " + n + " is " + ans);
    }
}
