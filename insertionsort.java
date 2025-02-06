import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.print("Enter Array Element : ");
            arr[i] = s.nextInt();
        }

        insertionSort(arr);
        System.out.println("The correct Array is :" + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){

        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
