package anton.converter.digit;
/*
0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14.......-->10
0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 -  A   -B  - C  - D  - E.......-->14
 */

import anton.converter.digit.impl.DigitConvert;

import java.util.ArrayList;
import java.util.List;

public class DigitConvertImpl implements DigitConvert {
    @Override
    public String convert(double digit, int radix) {
        int newDigit = (int) Math.round(digit);

        List<Character> listNumbers = getAllRadix();

        if (radix < 2 || radix >= listNumbers.size() || newDigit < 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder value = new StringBuilder();
        while (newDigit > 0) {
            value.insert(0, listNumbers.get(newDigit % radix));
            newDigit /= radix;
        }
        return value.toString();
    }

    private static List<Character> getAllRadix() {
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0'; i < '9'; i++) {
            digits.add(i);
        }
        for (char i = 'A'; i < 'Z'; i++) {
            digits.add(i);
        }
        return digits;
    }
}