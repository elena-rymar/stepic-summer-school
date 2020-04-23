package stepic.baseSyntax;
import java.util.Scanner;

/*
    1.1 Ввод вывод
    Hello world!
    Вводится целое число. Необходимо вывести на экран Hello World!﻿
    Sample Input: 5
    Sample Output: Hello World!
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Hello World!");

    }
}
