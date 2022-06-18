package anton;

import anton.converter.digit.impl.DigitConvertImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitConvertImplTest {
    DigitConvertImpl digitConvert = new DigitConvertImpl();

    @Test
    void convertTo3Radix() {
        Assertions.assertEquals("11111", digitConvert.convert());
    }

    @Test
    void convertTo9Radix() {
        Assertions.assertEquals("", digitConvert.convert());
    }

    @Test
    void convertTo14Radix() {
        Assertions.assertEquals("", digitConvert.convert());
    }

    @Test
    void convertNumberIsMinusTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> digitConvert.convert(-1, 2));
    }

    @Test
    void convertRadixOverSizeTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> digitConvert.convert(6545, 200));
    }
}