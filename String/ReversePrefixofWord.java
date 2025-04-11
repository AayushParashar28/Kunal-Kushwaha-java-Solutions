public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch); 
           return index >= 0 ? 
                 new StringBuilder(word.substring(0,index+1))
                 .reverse()
                 .append(word.substring(index+1,word.length()))
                 .toString() : 
                 word; 
     }
}
