import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        for(int i = 0 ;  i < n ; i++){
            System.out.print(n1 + " ");
            int sum = n1 + n2 ;
            n1 = n2;
            n2 = sum;
        }
    }
}
