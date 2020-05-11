package stepic.baseSyntax.Lesson1_7.Step6;
import java.util.Scanner;

/*
    Счетчик запусков 2
﻿Существует функция:

static int foo(int n){
     return n < 2 ? 1 : foo(n-1) + foo(n-2);
}
Напишите программу, которая в зависимости от переданного параметра N будет считать количество запусков данной функции на стеке.

Необходимо написать всю программу целиком, включая функцию.

На вход программа получает одно натуральное число N  и должна выдать ответ - одно натуральное число.

N не превосходит 30.
 */

public class Main {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(foo(a));
    }
    static int foo(int n){
        counter++;
        return n < 2 ? 1 : foo(n-1) + foo(n-2);
    }
}
