package anton;

import anton.converter.digit.DigitConvertImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitConvertImplTest {
    DigitConvertImpl digitConvert = new DigitConvertImpl();

    protected final int digit1 = 100;
    protected final int digit2 = 1508;
    protected final int digit3 = 98486;

    protected final int radix1 = 3;
    protected final int radix2 = 9;
    protected final int radix3 = 14;

    protected final int incorrectDigit1 = -3;
    protected final String incorrectDigit2 = "3*";

    protected final int incorrectRadix1 = -3;
    protected final String incorrectRadix2 = "m";


    @Test
    void convertTo3Radix() {
        Assertions.assertEquals("10201", digitConvert.convert(digit1, radix1));
    }

    @Test
    void convertTo9Radix() {
        Assertions.assertEquals("2055", digitConvert.convert(digit2, radix2));
    }

    @Test
    void convertTo14Radix() {
        Assertions.assertEquals("27D6B", digitConvert.convert(digit3, radix3));
    }

    @Test
    void convertWithIncorrectInt() {
        Assertions.assertThrows(Exception.class, () -> digitConvert.convert(incorrectDigit1, incorrectRadix1));
    }

    @Test
    void convertWithIncorrectType() {

    }
}