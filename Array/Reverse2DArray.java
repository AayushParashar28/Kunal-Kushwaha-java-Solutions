import java.util.Arrays;
import java.util.Scanner;

public class Reverse2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ARRAY ROW: ");
        int n = s.nextInt();
        System.out.print("Enter Array Column: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter " + i + "th element of Array: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] arr1 = reverse(arr);
        System.out.println("Reversed and Inverted Array:");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }

    public static int[][] reverse(int[][] image){
        for(int i = 0 ; i < image.length ; i++){
            Reverse(image[i]);
        }

        for(int i = 0; i < image.length ; i++){
            for(int j = 0; j <image[i].length ; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }

        return image;
    }

    public static void Reverse(int[] arr2){
        int start = 0 ;
        int end = arr2.length - 1;
        while(start < end){
            swap(arr2 , start , end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
