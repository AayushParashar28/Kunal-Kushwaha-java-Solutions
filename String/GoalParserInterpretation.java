public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str)); // Output: Goal
        String ab = "G()()()()(al)";
        System.out.println(interpret(ab)); // Output: Gooooal
    }

    public static String interpret(String command) {
        String str = command.replace("()" , "o").replace("(al)" , "al") ; 
        return str ;
    }
}
