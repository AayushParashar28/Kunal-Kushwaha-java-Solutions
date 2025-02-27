import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            print(n,i);
        }

        for(int i = n - 1 ; i >= 1 ; i--){
            print(n,i);
        }
    }

    static void print(int n, int i) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for(int j = i ; j >= 1 ; j--){
            System.out.print(j);
        }

        for( int j = 2 ; j <= i ; j++){
            System.out.print(j);
        }
        System.out.println();

    }
}
