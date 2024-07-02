import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sumofnegativenumber = 0;
        int sumofevennumber = 0;
        int sumofoddnumber = 0;

        while (true) {
            System.out.print("Enter number and if u want to terminate the program enter 0");
            int n = s.nextInt();

            if (n == 0) {
                break;
            } else if (n < 0) {
                sumofnegativenumber += n;
            } else {
                if (n % 2 == 0) {
                    sumofevennumber += n;
                } else {
                    sumofoddnumber += n;
                }
            }
        }

        System.out.println("Sum of negative numbers: " + sumofnegativenumber);
        System.out.println("Sum of positive even numbers: " + sumofevennumber);
        System.out.println("Sum of positive odd numbers: " + sumofoddnumber);
    }
}
