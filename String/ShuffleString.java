public class ShuffleString {
    public static void main(String[] args) {
        int index[] = {4,5,6,7,0,2,1,3};
        String str = "codeleet";

        System.out.println(restoreString(str, index));

    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for(int i = 0 ; i < s.length() ; i++)
        {
            result[indices[i]] = s.charAt(i) ;
        }

        return new String(result) ;
    }
}
