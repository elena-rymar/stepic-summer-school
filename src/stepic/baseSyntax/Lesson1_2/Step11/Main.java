package stepic.baseSyntax.Lesson1_2.Step11;
import java.util.Scanner;

/*
    Правильное округление.
﻿Знаменатель дроби всегда равен 3. Все числа кроме кратных 3 образуют бесконечные периодические дроби. Вам необходимо написать программу, которая будет округлять в большую сторону результат деления числа N на 3.

На вход программа получает натуральное число N, при чем N не превосходит 10^{18}10
18


Вывести результат деления на 3, округленный в большую сторону.

Например 1,1112 = 2
Sample Input 1:

1
Sample Output 1:

1
Sample Input 2:

30
Sample Output 2:

10
Sample Input 3:

13
Sample Output 3:

5
Sample Input 4:

33
Sample Output 4:

11
Sample Input 5:

165165168418
Sample Output 5:

55055056140
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        int b = 3;
        long c = a/b;
        if (a%3!=0)
            System.out.print(c+1);
        else
            System.out.print(c);

    }
}