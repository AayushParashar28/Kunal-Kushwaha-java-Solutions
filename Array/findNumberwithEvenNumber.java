import java.util.Scanner;

public class findNumberwithEvenNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            System.out.print("Enter Array" + i + "th element: ");
            arr[i] = s.nextInt();
        }

        int arr1 = EvenNumber(arr);
        System.out.println("Total Even Numbers in Array are: " + arr1);
    }

    public static int EvenNumber(int[] arr){
        int count = 0;
        int temp = 0;
        int evencount = 0;

        for (int i : arr) {
            while( i != 0){
                temp = i % 10;
                count++;
                i = i/10;
            }
            if(count%2==0){
                evencount++;
            }
            count = 0;
        }
        return evencount;
    }
}
