import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome1();
    }

    static void Palindrome1(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        int temp = n ;
        int rem , sum = 0;
        while(temp > 0){
            rem = temp % 10;
            sum = (sum*10)+rem;
            temp = temp/10;
        }
        if(n == sum){
            System.out.println("Pallindrome number");
        }else{
            System.out.println("Not a Pallindrome number");
        }
    }
}
