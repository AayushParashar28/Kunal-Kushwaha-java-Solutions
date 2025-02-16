package String;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        System.out.println("Enter a character: ");
        char ch = s.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                }
                }
                System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
}
