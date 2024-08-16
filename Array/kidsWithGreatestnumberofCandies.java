import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kidsWithGreatestnumberofCandies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();
        System.out.print("Enter ExtraCandies : ");
        int extracandies = s.nextInt();
       

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }
        List<Boolean> arr1 = new ArrayList<>();
        arr1 = kidsWithCandies(arr, extracandies);
        System.out.println(arr1);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = candies[0];
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        
        for(int candy : candies){
            if(candy + extraCandies >= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }

}
