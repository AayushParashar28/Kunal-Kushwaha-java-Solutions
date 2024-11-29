public class PositionOfElementInSortedInfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 10, 15, 20, 25, 30, 25, 40, 45, 50, 55, 60 };
        int target = 55;

        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start = newStart;
        }

        return binarysearch(arr, target, start, end);
    }

    public static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
