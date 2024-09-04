import java.util.*;
import java.lang.Math;

public class FourJavaProgram {
    public static void main(String[] args) {
        DepriciationValue();
        battingAverage();
        CGPA();
        CompoundInterest();
        AverageMarks();
        sumofNnumbers();
    }

    static void DepriciationValue(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value at Certain Time :");
        double v = s.nextDouble();
        System.out.print("Enter Rate :");
        double r = s.nextDouble();
        System.out.print("Enter Time :");
        double t = s.nextDouble();

        double finalvalue = v * Math.pow((1-r / 100 ), t);
        System.out.println("Final Value is " + finalvalue);
    }

    static void battingAverage(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total Score :");
        int v = s.nextInt();
        System.out.print("Enter total no. of times the player get out :");
        int r = s.nextInt();

        int ans = v / r ;
        System.out.println("The Batting Average of Player is : " + ans);
    }

    static void CGPA(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total Marks obtained :");
        float v = s.nextFloat();
        System.out.print("Enter Total Subjects :");
        float r = s.nextFloat();

        float cgpa = v/r;
        System.out.println("CGPA is : " + cgpa);
    }

    static void CompoundInterest(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal :");
        double p = s.nextDouble();
        System.out.print("Enter Rate :");
        double r = s.nextDouble();
        System.out.print("Enter Time :");
        double t = s.nextDouble();

        double finalvalue = p * Math.pow((1+r / 100 ), t);
        System.out.println("Final Value is " + finalvalue);
    }

    static void AverageMarks(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total Marks obtained :");
        int v = s.nextInt();
        System.out.print("Enter Total Subjects :");
        int r = s.nextInt();

        int averagemarks = v/r;
        System.out.println("Average Marks is : " + averagemarks);
    }

    static void sumofNnumbers(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = s.nextInt();

        int ans = n* (n+1)/2 ;
        System.out.println("The sum of n Numbers is : " + ans);
    }
}
