import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = n ; j > i ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
         
        System.out.println();

        for(int i = n ; i > 1 ; i--){
            for(int j = n ; j > i ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
