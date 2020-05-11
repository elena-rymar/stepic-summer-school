package stepic.baseSyntax.Lesson1_8.Step1;
import java.math.BigInteger;
import java.util.Scanner;

/*
    Длинная арифметика
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(factor(new BigInteger("10")));

    }
    private static BigInteger factor (BigInteger val){
        return val.equals(BigInteger.ONE) ? val : val.multiply(factor(val.add(new BigInteger("-1"))));
    }
}
