import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        boolean flag = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Pallindrome Number");
        } else {
            System.out.println("Not Pallindrome Number");
        }

    }
}
