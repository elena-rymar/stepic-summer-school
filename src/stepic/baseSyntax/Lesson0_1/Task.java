package stepic.baseSyntax.Lesson0_1;

public class Task {
    public static void main(String[] args) {
        int decimalNumber = 500; // a decimal number, it consists of digits 0-9
        int hexNumber = 0xFF; // a hexadecimal number, it consists of digits 0-9 and letters A-F
        int binaryNumber = 0b10001; // a binary number, it consists of digits 0 and 1
        int octalNumber = 0335; // an octal number, it consists of digits 0-7
        long longNumber = 33L; // L or l - is a literal for longs
        long bigNumber = 100_000_000_000L; // _ is the underscore character

        int intZero; // it's equal to 0;
        long longZero; // it's equal to 0L;

        int minInt = Integer.MIN_VALUE; // The min value of int type
        int maxInt = Integer.MAX_VALUE; // The max value of int type
        long minLong = Long.MIN_VALUE; // The min value of long type
        long maxLong = Long.MAX_VALUE; // The max value of long type

        int a = 6;
        int b = 2;
        int sum = a + b; // addition, the result is 8
        int diff = a - b; // subtraction, the result is 4
        int mult = a * b; // multiplication, the result is 12
        int intDiv = a / b; // integer division, the result is 3
        int remainder = a % b; // remainder, the result is 0
        int negRem = -21 % 4; // the result is -1 because -21 divided by 4 leaves a remainder of -1

        int divResult = 5 / 0; // throws ArithmeticException
        int remResult = 5 % 0; // also throws ArithmeticException

        int e = ++a; // prefix increment: e is 7, a is 7
        int g = e++; // postfix increment: c is 7, b is 8
        int d = g--; // postfix decrement: d is 7, c is 6

        int q = 2, w = 3, r = 4;
        q += w; // the same as a = a + b, the result is 5
        r *= w; // the same as c = c * b, the result is 12

        /*unary: +, -, ++, --
multiplicative: *, /, %
additive: +, -
assignment: =, +=, -=, *=, /=*/
    }
}
