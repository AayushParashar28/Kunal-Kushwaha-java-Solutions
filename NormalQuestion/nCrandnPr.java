import java.util.Scanner;

public class nCrandnPr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = s.nextInt();
        System.out.print("Enter r : ");
        int r = s.nextInt();

        int ans = nCr(n , r);
        System.out.println(n + "C" + r + " is : " + ans);
        int ans2 = nPr(n , r);
        System.out.println(n + "P" + r + " is : " + ans2);
    }


    static int nCr(int n , int r){
        return fact(n)/(fact(r)*fact(n-r));
    }

    static int nPr(int n , int r ){

        return fact(n)/fact(n-r);
    }

    static int fact(int n){
        int res = 1 ;
        for (int i = 2; i <= n; i++) {
            res = res * i ;
        }
        return res;
    }

    static int fact1(int n){
        if(n <= 1){
            return 1 ;
        }
        return n * fact(n-1);
    }
}
