package anton.converter;

import anton.converter.digit.impl.DigitConvertImpl;

import java.util.Scanner;

public class Main {
    private static int digit;
    private static int radix;

    private static void inputDigit() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type a digit:-->");
            digit = scanner.nextInt();

            System.out.println("Please type a radix:-->");
            radix = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input type");
        }
    }

    public static void main(String[] args) {
        inputDigit();
        System.out.println(new DigitConvertImpl().convert(digit, radix));
    }
}