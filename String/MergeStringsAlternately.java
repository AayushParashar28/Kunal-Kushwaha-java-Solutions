public class MergeStringsAlternately {
    public static void main(String[] args) {
        String  word1 = "abc";
        String word2 = "pqr";
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (j<word1.length() && j<word2.length()) {
            sb.append(word1.charAt(j));
            sb.append(word2.charAt(j));
            j++;
        }
        sb.append(word1.substring(j));
        sb.append(word2.substring(j));
        return sb.toString();
    }
}
