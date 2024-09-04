import java.util.Scanner;

public class HCMandLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n = s.nextInt();

        System.out.print("Enter Number 2 : ");
        int m = s.nextInt();

        int ans = HCM(n , m);
        System.out.println("HCF of 2 number is : " + ans);
        int ans1 = LCM(n , m);
        System.out.println("LCM of 2 number is : " + ans1);
    }


    static int HCM(int n , int m){
        int temp , temp1 , temp2 ;
        temp1 = n;
        temp2 = m;
        while(temp2 > 0){
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        return temp1;
    }

    static int LCM(int n , int m){
        int lcm = (n*m)/HCM(n,m);
        return lcm;
    }
}
