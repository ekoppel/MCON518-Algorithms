import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpreadsheetTest {
    @Test
    public void SpreadsheetTest(){
        long n = 702;

        String second = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("1ZZ", second);
    }

    @Test
    public void test2() {
        long n = 52;

        String first = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("1AZ", first);
    }

    @Test
    public void test3() {
        long n = 26;

        String fourth = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("1Z", fourth);
    }

    @Test
    public void test4() {
        long n = 654;

        String fifth = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("1YD", fifth);
    }

    @Test
    public void test5() {
        long n = 703;

        String third = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("2A", third);
    }

    @Test
    public void test6() {
        long n = 3859;

        String sixth = Spreadsheet.convertToSpreadsheet(n);

        assertEquals("6MK", sixth);
    }
}
