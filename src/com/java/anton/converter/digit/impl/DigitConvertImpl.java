package anton.converter.digit.impl;

import anton.converter.digit.DigitConvert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DigitConvertImpl implements DigitConvert {

    @Override
    public String convert(double number, int radix, int precision) {
        int[] leftAndRight = getFraction(number, precision);
        List<Character> listNumbers = getAllRadix();
        List<String> stringList = new LinkedList<>();
        StringBuilder value = new StringBuilder();

        if (radix < 2 || radix >= listNumbers.size() || number < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < leftAndRight.length; i++) {
            while (leftAndRight[i] > 0) {
                value.insert(0, listNumbers.get(leftAndRight[i] % radix));
                leftAndRight[i] = leftAndRight[i] / radix;
            }
            stringList.add(value.toString());
            value.setLength(0);
        }
        return stringList.get(0) + "." + stringList.get(1);
    }

    private static List<Character> getAllRadix() {
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            digits.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            digits.add(i);
        }
        return digits;
    }

    private static int[] getFraction(double digit, int precision) {
        String example = Double.toString(digit);
        String[] array = example.split("\\.");
        String fraction = array[1].substring(0, precision);

        return new int[]{Integer.parseInt(array[0]), Integer.parseInt(fraction)};
    }
}