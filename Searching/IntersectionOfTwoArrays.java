import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = s.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " of the first array: ");
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = s.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the elements of the second array at index " + i + ": ");
            arr2[i] = s.nextInt();
        }
        int[] result = intersection(arr1, arr2);
        System.out.println("The intersection of the two arrays is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] intersection(int[] arr1 , int[] arr2){
        int[] result = new int[arr1.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    result[j] = arr1[i];
                    j++;
                    }
                    }
                    }
                    int[] temp = new int[j];
                    System.arraycopy(result, 0, temp, 0, j);
                    return temp;
    }
}