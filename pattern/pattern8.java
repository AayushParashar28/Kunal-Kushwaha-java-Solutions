import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        
        int num = 1;
        for(int i = n ; i >= 1 ; i--){
            for (int j = i ; j >= 1; j--) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }
}
