public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder output = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                output.append((char) ('a' + num - 1));
                i -= 3;
            } else {
                output.append((char) ('a' + (s.charAt(i) - '0') - 1));
                i--;
            }
        }
        
        return output.reverse().toString();
    }
}
