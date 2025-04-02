public class CheckifBinaryStringHasatMostOnesegmentofOnes {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));

        String s1 = "110";
        System.out.println(checkOnesSegment(s1));
    }

    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
