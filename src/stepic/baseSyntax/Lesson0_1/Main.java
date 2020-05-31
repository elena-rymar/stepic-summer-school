package stepic.baseSyntax.Lesson0_1;

/*
    1.1 Ввод вывод
    Hello world!
    Вводится целое число. Необходимо вывести на экран Hello World!﻿
    Sample Input: 5
    Sample Output: Hello World!
 */

public class Main {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        boolean b4 = b1 ^ !b3 & b2;
        boolean b6 = b1 ^ !b3;
        boolean b7 = !b3 & b2;
        boolean b5 = b1 ^ !b3 && b2;
        boolean b8 = !b3 && b2;
    }
}
