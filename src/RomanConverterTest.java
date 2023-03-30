import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterTest {

    @Test
    public void testInvalidInput() {
        assertEquals(0, RomanConverter.romanToInt(""));
        assertEquals(0, RomanConverter.romanToInt("A"));
        assertEquals(0, RomanConverter.romanToInt("IIII"));
        assertEquals(0, RomanConverter.romanToInt("XDX"));
    }

    @Test
    public void testInvalidThenValidInput() {
        assertEquals(0, RomanConverter.romanToInt("XDX"));
        assertEquals(9, RomanConverter.romanToInt("IX"));
    }

    @Test
    public void testRepetition() {
        assertEquals(4, RomanConverter.romanToInt("IIII"));
        assertEquals(40, RomanConverter.romanToInt("XXXX"));
        assertEquals(900, RomanConverter.romanToInt("CM"));
    }

    @Test
    public void testNotValidRoman() {
        assertEquals(0, RomanConverter.romanToInt("IC"));
        assertEquals(0, RomanConverter.romanToInt("XD"));
        assertEquals(0, RomanConverter.romanToInt("VX"));
    }

    @Test
    public void testManyLetters() {
        assertEquals(8, RomanConverter.romanToInt("VIII"));
        assertEquals(19, RomanConverter.romanToInt("XIX"));
        assertEquals(299, RomanConverter.romanToInt("CCXCIX"));
        assertEquals(1984, RomanConverter.romanToInt("MCMLXXXIV"));
    }



    //Additional Tests


}

