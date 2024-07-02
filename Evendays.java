import java.util.Scanner;

public class Evendays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter totaldays in a month : ");
        int n = s.nextInt();

        int ans = checkeven(n);
        System.out.println("The even no. of days in " + n + " days is " + ans);
    }

    static int checkeven(int n) {
        int count = 0 , temp;
        temp = n;
        while (temp != 0) {
           if(temp%2==0){
            count++;
           }
           temp--;
        }
        return count;
    }
}
