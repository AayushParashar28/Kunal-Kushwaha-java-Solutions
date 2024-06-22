import java.util.Scanner;

public class AreaProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Area of :");
        String n = s.next();

        String a = "Circle";
        String b = "Rectangle";
        String c = "Traingle";
        String d = "Isosceles Traingle";
        String e = "Parallelogram";
        String f = "Rohmbus";
        String g = "EquilateralTraingle";

        if (n.equals(a)) {
            double pi = 3.142, area;
            System.out.print("Enter Radius :");
            int radius = s.nextInt();

            area = pi * radius * radius;
            System.out.println("Area of Circle is : " + area);
        }

        else if (n.equals(b)) {
            System.out.print("Enter length :");
            int length = s.nextInt();

            System.out.println("Enter Width :");
            int Width = s.nextInt();

            int area = length * Width;
            System.out.println("Area of Rectangle is :" + area);
        }

        else if (n.equals(c)) {
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int area = (base * height) / 2;
            System.out.println("Area of Traingle is :" + area);
        }

        else if (n.equals(d)) {
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int area = (base * height) / 2;
            System.out.println("Area of Isosceles Traingle is :" + area);
        }

        else if (n.equals(e)) {
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int area = 2 * ( base + height);
            System.out.println("Area of Parallelogram : " + area);
        }

        else if (n.equals(f)) {
            System.out.print("Enter Length of  a Side : ");
            int aside =  s.nextInt();

            int area = 4 * aside;
            System.out.println("Area of Rohmbus is : " + area);
        }

        else if (n.equals(g)) {
            System.out.print("Enter side of a Traingle :");
            float side = s.nextFloat();

            double area = (1.73 * side * side)/4;
            System.out.println("Area of Equilateral Traingle is :" + area);
        }
    }
}
