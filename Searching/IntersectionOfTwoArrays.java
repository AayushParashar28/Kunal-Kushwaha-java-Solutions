import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = s.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " of the first array: ");
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = s.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter the elements of the second array at index " + i + ": ");
            arr2[i] = s.nextInt();
        }
        
        int[] result = intersection(arr1, arr2);
        System.out.print("The intersection of the two arrays is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        // Add elements of arr1 to a set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Check for intersection with elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                resultList.add(arr2[i]);
                set.remove(arr2[i]);  // To avoid duplicates in result
            }
        }

        // Convert ArrayList to int[] array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
