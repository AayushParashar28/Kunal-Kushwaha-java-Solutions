public class MaximumSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word) {
        int ans = 1;
        while (sequence.contains(word.repeat(ans))) {
            ans++;
        }
        return ans - 1;
    }
}

