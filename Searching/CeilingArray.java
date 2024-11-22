import java.util.Scanner;

public class CeilingArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Ceiling of Array Elements : ");
        int target = s.nextInt();

        int ans = ceiling(arr,target);
        System.out.println("Ceiling of "+target+" is " + ans);
    }

    public static int ceiling(int[] arr, int target) {

        if(target > arr[arr.length -1])  return -1;
        int start = 0 ; 
        int end = arr.length -1 ;
        
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if (target > arr[mid]) {
                start = mid + 1 ;
            }
            else if (target < arr[mid]) {
                end = mid - 1 ;
            }
            else{
                return mid;
            }
            
        }
        int temp = arr[start];
        return temp;
    }
}