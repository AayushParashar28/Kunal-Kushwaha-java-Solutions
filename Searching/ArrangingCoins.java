import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Coins: ");
        int n = s.nextInt();
        
        int ans = arrangecoins(n);
        System.out.println(ans);
    }

    static int arrangecoins(int n) {
        long start = 0;
        long end = n;
        long ans = 0;
        long mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            long count = (mid * (mid + 1)) / 2;

            if (count <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int)ans;
    }
}