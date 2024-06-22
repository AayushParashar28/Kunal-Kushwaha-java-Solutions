import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println("Hey , How are you, I hope everything is fine " + " " + n);
    }
}
