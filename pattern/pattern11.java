import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                if((i+j)% 2 == 0){
                    System.out.print(Character.toLowerCase(ch) + " ");
                }
                else{
                    System.out.print(Character.toUpperCase(ch) + " ");
                }

                ch++;
                
            }
            System.out.println();
            
        }

    }
}
