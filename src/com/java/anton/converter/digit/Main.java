package anton.converter.digit;

import anton.converter.digit.impl.DigitConvertImpl;
import anton.converter.person.Hobby;

import java.util.Scanner;

public class Main {
    private static double digit;
    private static int radix;
    private static int precision;

    private static void inputDigit() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Please type a digit:-->");
                digit = scanner.nextDouble();

                System.out.println("Please type a radix:-->");
                radix = scanner.nextInt();

                System.out.println("Please type a precision:-->");
                precision = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Incorrect input type");
            }
            System.out.println(new DigitConvertImpl().convert(digit, radix, precision));
        }

    public static void main(String[] args) {

    }
}