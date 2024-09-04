import java.util.Scanner;

public class EvenorOddusingfunction {
    public static void main(String[] args) {
        evenorodd();
    }

    static void evenorodd(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
