import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-1 ; j++){
                if(i == 1 || i == n || j == 1 || j ==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
