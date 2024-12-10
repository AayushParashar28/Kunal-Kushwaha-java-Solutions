import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.print("Enter elements at " + i + "th index : ");
            arr[i] = s.nextInt();
        }
    }
}
