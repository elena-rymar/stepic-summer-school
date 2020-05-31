package stepic.baseCourse.Lesson0_1;

/*
    1.1 Ввод вывод
    Hello world!
    Вводится целое число. Необходимо вывести на экран Hello World!﻿
    Sample Input: 5
    Sample Output: Hello World!
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(booleanExpression(false,true,true,true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a & b) ^ (b & c))^ ((c & d) ^ (a & c)) ^ ((a & d) ^ (b & d)) | ((a & b) ^ (c & d)) ;//| ((a & c) ^ (b & d));
    }
}




