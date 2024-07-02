import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Leapyear();     
        
    }
    static void Leapyear(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int n = s.nextInt();

        if(n%4==0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap year");
        }
    }
}

