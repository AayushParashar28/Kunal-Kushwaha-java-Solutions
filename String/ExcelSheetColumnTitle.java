public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
       int Col = 1;
       System.out.println(convertToTitle(Col));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            char c = (char)(columnNumber % 26 + 'A');
            columnNumber /= 26;
            output.append(c);
        }

        output.reverse();
        return output.toString();
    }
}
