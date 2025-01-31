import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Array Element at index " + i + " : ");
            arr[i] = s.nextInt();
        }

       selectionSort(arr);
       System.out.println("The Sorted Array using selection sort is : " + Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxIndex = maxindex(arr, i, last);
            swap(arr, maxIndex, last);
        }
    }

    static int maxindex(int[] arr, int start, int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
