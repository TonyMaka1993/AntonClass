package anton.converter.digit.impl;
/*
1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14.......-->10
1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 -  A   -B  - C  - D  - E.......-->14
 */

import anton.converter.digit.DigitConvert;

import java.util.ArrayList;
import java.util.List;

public class DigitConvertImpl implements DigitConvert {
    @Override
    public String convert(int number, int radix) {
        List<Character> listNumbers = getAllRadix();

        if (radix < 2 || radix >= listNumbers.size() || number < 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder value = new StringBuilder();
        while (number > 0) {
            value.insert(0, listNumbers.get(number % radix));
            number = number / radix;
        }
        return value.toString();
    }

    private static List<Character> getAllRadix() {
        // 1_ _ _ _ _9 A_ _ _ _ _ _ _ _ _Z
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            digits.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            digits.add(i);
        }
        return digits;
    }
}