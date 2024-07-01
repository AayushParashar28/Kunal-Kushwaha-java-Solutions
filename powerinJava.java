import java.util.Scanner;

public class powerinJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base :");
        int base = s.nextInt();

        System.out.print("Enter Exponent :");
        int exponent = s.nextInt();

        int ans = power(base , exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + ans);
    }

    static int power(int base , int exponent){
        int pow = 1 ;
        for(int i = 0 ; i < exponent ; i++){
            pow *= base;
        }
        return pow;
    }
}
