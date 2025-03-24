public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        final int len = s.length(); 
        
        if(len == 1) 
            return s;
        
        int firstIndex, lastIndex;
        char[] ch = s.toCharArray(); 
        char temp;
        
        for(int index = 0 ; index < len ; index++){
            
            firstIndex = index;
            
            while(++index < len && ch[index] != ' '); 
            
            lastIndex = index - 1; 
            while(firstIndex < lastIndex){
                temp = ch[firstIndex];
                ch[firstIndex++] = ch[lastIndex];
                ch[lastIndex--] = temp;
            }
        }
        
        return new String(ch);
    }
}
