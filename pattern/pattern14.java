import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        int size = 2*n-1;

        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= size ; j++){
                int minDist = Math.min(Math.min(i, j), Math.min(size - i, size - j));
                System.out.print((minDist) + " ");
            }
            System.out.println();
        }

    }
}
