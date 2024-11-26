import java.util.Scanner;

public class FirstBadVersion{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = s.nextInt();

        System.out.print("Enter Bad : ");
        int bad = s.nextInt();
        

        int ans = firstBadVersion(n , bad);
        System.out.println("First Bad Version is : " + ans);
    }

    public static int firstBadVersion(int n ,  int bad) {
        int start = 0; 
        int end = n;
        int temp = 1;

        while(start <= end){
            int mid = start + ( end - start)/2;
            if(isBadVersion(mid , bad)){
                temp = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return temp;
    }
    
    public static boolean isBadVersion(int mid , int bad){
        
        if(bad == mid){
            return true;
        }
        return false;
    }
}