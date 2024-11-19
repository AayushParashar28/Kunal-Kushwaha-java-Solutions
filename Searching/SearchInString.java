import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        String[] arr = new String[n];
        System.out.print("Enter String : ");
        for (int i = 0; i < n ; i++) {
            arr[i]= s.next();
        }       
        
        System.out.print("Enter the character");
        String search = s.next();
        
        int st = searchInString(arr, search);
        System.out.println("The String found at index : " + st);

    }

    public static int searchInString(String[] str, String search) {
        
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(search)){
                return i;
            }
        }
        return -1;
    }

}
