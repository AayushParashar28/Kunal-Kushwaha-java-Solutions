import java.util.Scanner;

public class ValidPerfectSqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean ans = isPerfectSquare(n);
        System.out.println(ans);
    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid < num){
                start = (int)mid + 1;
            }
            else{
                end = (int)mid - 1;
            }

        }
        return false;
    }
}
