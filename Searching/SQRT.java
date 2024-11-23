import java.util.Scanner;

public class SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Square root of " + n + " is " + Math.sqrt(n));
        
        int ans = sqrt(n);
        System.out.println("The Sqare Root is : " + ans);
    }

    public static int sqrt(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if(square == n){
                return mid;
            }
            else if(square < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return Math.round(end);
    }
}
