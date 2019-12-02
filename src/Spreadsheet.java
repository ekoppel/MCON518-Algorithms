public class Spreadsheet {
    public static void main(String[] args) {
    }

    public static String convertToSpreadsheet(long n) {
        String rowNumber = "" + ((n / 703) + 1);
        String colLetter = convertToNumbers(n % 702);
        return rowNumber + colLetter;
    }

    public static String convertToNumbers(long n) {
        if (n == 0) return "ZZ";
        char secondLetter = (char) ((n % 26) + 64);
        if (n % 26 == 0) secondLetter = 'Z';
        char firstLetter = secondLetter == 'Z' ? (char) ((n / 26) + 63) : (char) ((n / 26) + 64);
        return (n / 27 == 0) ? "" + secondLetter : "" + firstLetter + secondLetter;
    }
}
