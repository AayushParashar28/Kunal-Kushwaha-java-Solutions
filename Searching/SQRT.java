import java.util.Scanner;

public class SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Square root of " + n + " is " + Math.sqrt(n));
        
        int ans = sqrt(n);
        System.out.println("Enter  a number : " + ans);
    }

    public static int sqrt(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid*mid < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return Math.round(end);
    }
}
