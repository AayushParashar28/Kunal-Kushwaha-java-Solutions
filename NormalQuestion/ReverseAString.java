import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
       reverseString();
    }

    static void reverseString(){
        Scanner s = new Scanner(System.in);
        System.out.print("");
        String n = s.nextLine();
        char[] ch = n.toCharArray() ;
        
        for(int i = ch.length - 1 ; i >= 0 ; --i){
            System.out.print(ch[i]);
        }
    }
}
