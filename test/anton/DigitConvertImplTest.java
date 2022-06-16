package anton;

import anton.converter.digit.DigitConvertImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitConvertImplTest {
    DigitConvertImpl digitConvert = new DigitConvertImpl();

    protected final int digit_a = 100;
    protected final int digit_b = 1508;
    protected final int digit_c = 98486;

    protected final int radix_a = 3;
    protected final int radix_b = 9;
    protected final int radix_c = 14;

    protected final int incorrectDigit_a = -3;
    protected final String incorrectDigit_b = "3*";

    protected final int incorrectRadix_a = -3;
    protected final String incorrectRadix_b = "m";


    @Test
    void convert_3() {
        Assertions.assertEquals("10201", digitConvert.convert(digit_a, radix_a));
    }

    @Test
    void convert_9() {
        Assertions.assertEquals("2055", digitConvert.convert(digit_b, radix_b));
    }

    @Test
    void convert_14() {
        Assertions.assertEquals("27D6B", digitConvert.convert(98486, 14));
    }

    @Test
    void convertException() {
        Assertions.assertThrows(Exception.class, () -> digitConvert.convert(incorrectDigit_a, incorrectRadix_a));
    }
}