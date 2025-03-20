public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
        String t = "textbook";
        System.out.println(halvesAreAlike(t));
    }

    public static boolean halvesAreAlike(String s) {
        int length = s.length() / 2;
        
        return checkVowel(s.substring(0 , length)) == checkVowel(s.substring(length));
    }

    public static int checkVowel(String str ) {
        int count = 0;
        for (char ch : str.toCharArray())
        {   
           if("AEIOUaeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }
}
