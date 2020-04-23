package stepic.baseSyntax.Lesson1_1.Step11;
import java.util.Scanner;

/*
    Сумма двух чисел
﻿Программа получает на вход два целых числа. Числа не превышают 1000000000.

Программа должна вывести одно целое число - сумму двух чисел.

Sample Input:

8 11
Sample Output:

19
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print((a+b));

    }
}
