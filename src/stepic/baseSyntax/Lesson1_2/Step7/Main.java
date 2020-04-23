package stepic.baseSyntax.Lesson1_2.Step7;
import java.util.Scanner;

/*
    Результат деления с точностью до 2 знака.
﻿Вводятся два числа с одинарной точностью. Вывести результат их деления с точностью до 2 знака.

В Си это выглядело бы так - printf("%0.2f", val)

Sample Input:

1 2
Sample Output:

0.50
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float a = in.nextInt();
        float b = in.nextInt();
        float c = a / b;
        System.out.printf("%.2f", c);

    }
}
