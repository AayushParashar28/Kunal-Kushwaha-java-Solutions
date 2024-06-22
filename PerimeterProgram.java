import java.util.Scanner;

public class PerimeterProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Area of :");
        String n = s.next();

        String a = "Circle";
        String b = "Rectangle";
        String c = "Square";
        String d = "Parallelogram";
        String e = "Rohmbus";
        String f = "EquilateralTraingle";

        if (n.equals(a)) {
            double pi = 3.142, perimeter;
            System.out.print("Enter Radius :");
            int radius = s.nextInt();

            perimeter = 2 * pi * radius;
            System.out.println("Perimeter of Circle is : " + perimeter);
        }

        else if (n.equals(b)) {
            System.out.print("Enter length :");
            int length = s.nextInt();

            System.out.println("Enter Width :");
            int Width = s.nextInt();

            int perimeter = 2 * (length + Width);
            System.out.println("Perimeter of Rectangle is :" + perimeter);
        }

        else if (n.equals(c)) {
            System.out.print("Enter Length of One Side : ");
            int side =  s.nextInt();

            int perimeter = 4 * side;
            System.out.println("Perimeter of Square is : " + perimeter);
        }

        else if (n.equals(d)) {
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int perimeter = 2 * ( base + height);
            System.out.println("Perimeter of Parallelogram : " + perimeter);
        }

        else if (n.equals(e)) {
            System.out.print("Enter Length of One Side : ");
            int side =  s.nextInt();

            int perimeter = 4 * side;
            System.out.println("Perimeter of Rohmbus is : " + perimeter);
        }


        else if (n.equals(f)) {
            System.out.print("Enter Length of One Side : ");
            int side =  s.nextInt();

            int perimeter = 3 * side;
            System.out.println("Perimeter of Equilateral Traingle is : " + perimeter);
        }
    }
}
