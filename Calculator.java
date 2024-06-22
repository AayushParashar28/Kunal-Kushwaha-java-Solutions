import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Operator : ");
        char op = s.next().charAt(0);
        
        int ans = 0;
        if(op  == '+' || op == '-' || op == '*' || op == '/'){
            System.out.println("Enter num1 :");
            int num1  = s.nextInt();
            System.out.println("Enter num2 :");
            int num2 = s.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {
                ans = num1 % num2;
            }

            System.out.println(ans);
        }else{
            System.out.println("Not Valid Operator");
        }

    }
}
