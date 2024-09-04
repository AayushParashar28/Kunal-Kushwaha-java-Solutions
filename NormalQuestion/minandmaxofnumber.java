import java.util.Scanner;

public class minandmaxofnumber {
    public static void main(String[] args) {
        minandmax();
    }

    static void minandmax(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n = s.nextInt();
        System.out.print("Enter number 2 : ");
        int m = s.nextInt();
        System.out.print("Enter number 3 : ");
        int p = s.nextInt();
        if(n>m && n>p){
            System.out.println("Number 1 " + n + " is greater than " + m + " and " + p); 
        }
        else if(m>n && m>p){
            System.out.println("Number 2 " + m + " is greater than " + n + " and " + p);
        }else{
            System.out.println("Number 3 " + p + " is greater than " + n + " and " + m);
        }
    }
}