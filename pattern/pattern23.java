import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        int m = n*2;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                if( i == j ||  i + j == m -1 || j == 0 || j == m -1  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
