import java.util.Scanner;

public class firstSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter Array element : ");
            arr[i] =  s.nextInt();
        }

        int[] ans = sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
            }
    }

    public static int[] sort(int[] arr){
        
        for(int i = 0 ; i < arr.length; i++){
           for(int j = i+1; j < arr.length; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                continue;
            }
           }
        }

        return arr;
    }
}
