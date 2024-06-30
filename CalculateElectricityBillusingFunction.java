import java.util.Scanner;

public class CalculateElectricityBillusingFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of Electricity used in units :");
        int n = s.nextInt();

        int ans = CalculateElectricity(n) ;
        System.out.println("The total Electricity Bill is : " + ans);
    }

    static int CalculateElectricity(int num){
        int total = num * 9 ;
        return total;
    }
}
