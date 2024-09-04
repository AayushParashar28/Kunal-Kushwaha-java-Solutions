import java.util.Scanner;
public class AverageofNnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Input Number : ");
        int n = s.nextInt();

        int ans = Average(n);
        System.out.println("The Average is :" + ans);
    }

    static int Average(int num){
        int average;
        int sum = 0 , count = 1;

        while (count <= num) {
            sum += count;
            count++;
        }

        average = sum/num ;


        return average;
    }
}
