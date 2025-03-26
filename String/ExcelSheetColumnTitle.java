public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        // Example implementation to convert a column number to its corresponding Excel sheet title
        int columnNumber = 28; // Example column number
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Decrement column number to make it 0-indexed
            char currentChar = (char) ('A' + (columnNumber % 26));
            columnTitle.insert(0, currentChar); // Prepend the character
            columnNumber /= 26; // Move to the next "digit"
        }

        System.out.println("Excel Column Title: " + columnTitle.toString());
    }
}
