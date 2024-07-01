import java.util.Scanner;

public class Distancenetweentwopoints {
    public static void main(String[] args) {
        Distance();
        CommisionPercentage();

    }

    static void Distance() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Point 1 : ");
        int n = s.nextInt();

        System.out.print("Enter Point 2 : ");
        int m = s.nextInt();

        if(m>=n){
            int ans = m - n ;
            System.out.println("Distance between two point is " + ans);
        }else{
            int ans = n - m;
            System.out.println("Distance between two point is " + ans);
        }
    }

    static void CommisionPercentage(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Commision: ");
        int commission = s.nextInt();
        System.out.print("Enter Total Sales: ");
        int Totalsales = s.nextInt();

        int percentage = (commission/Totalsales)*100;
        System.out.println("The Commission Percentage is : " + percentage );
    }
}

// Commission Percentage