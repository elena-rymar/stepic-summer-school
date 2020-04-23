package stepic.baseSyntax.Lesson1_2.Step10;
import java.util.Scanner;

/*
    Делим пиццу
﻿Дано N пицц. Пиццу резать нельзя! Если распределить пиццы поровну среди М друзей, то по скольку пицц получит каждый друг и сколько пицц окажутся не распределенными?

Программа получает на вход два натуральных числа N и M, при чем N > M.

N не превосходит 10^910
9


Программа должна вывести два числа - сколько пицц достанется каждому другу и сколько пицц останется не распределенными через пробел.

Sample Input 1:

30 5
Sample Output 1:

6 0
Sample Input 2:

55 23
Sample Output 2:

2 9
Sample Input 3:

1147 12
Sample Output 3:

95 7
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a/b;
        int d = a-(c*b);
        System.out.printf(c+" "+d);

    }
}
