import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        
        for (int i = n; i >= 1; i--) {
            char ch = (char) ('A' + (i - 1));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }            
            System.out.println();         
        }
    }
}
