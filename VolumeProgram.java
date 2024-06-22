import java.util.Scanner;
public class VolumeProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Area of :");
        String n = s.next();

        String a = "Cone";
        String b = "Prism";
        String c = "Cylinder";
        String d = "Sphere";
        String e = "Pyramid";
        
        if(n.equals(a)){
            System.out.print("Enter area :");
            int area = s.nextInt();

            int volume = area * area * area;
            System.out.println("Volume of Cone is :" + volume);
        }

        else if(n.equals(b)){
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int volume = (base * height);
            System.out.println("Volume of Prism is :" + volume);
        }

        else if (n.equals(c)) {
            double pi = 3.142, volume;
            System.out.print("Enter Radius :");
            int radius = s.nextInt();
            System.out.print("Enter Height :");
            int height = s.nextInt();

            volume = pi * radius * radius * height;
            System.out.println("Volume of Cylinder is : " + volume);
        }

        else if (n.equals(d)) {
            double pi = 3.142, volume;
            System.out.print("Enter Radius :");
            int radius = s.nextInt();

            volume = (4 *pi * radius * radius * radius)/3;
            System.out.println("Volume of Sphere is : " + volume);
        }

        else if(n.equals(e)){
            System.out.print("Enter Base: ");
            int base = s.nextInt();

            System.out.print("Enter Height: ");
            int height = s.nextInt();

            int volume = (base * height)/3;
            System.out.println("Volume of Pyramid is :" + volume);
        }


    }
}
