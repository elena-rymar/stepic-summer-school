package stepic.baseSyntax.Lesson1_3.Step10;
import java.util.Scanner;

/*
    Скобки
﻿Вводится число N, N не превосходит 10.000.

Необходимо вывести N открытых квадратных скобок [, после чего столько же закрытых.

Sample Input 1:

5
Sample Output 1:

[[[[[]]]]]
Sample Input 2:

7
Sample Output 2:

[[[[[[[]]]]]]]
Sample Input 3:

3
Sample Output 3:

[[[]]]
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int f = 0;
        int a = in.nextInt();
        while  (i++ < a){
            System.out.print("[");
        }
        while  (f++ < a){
            System.out.print("]");
        }
    }
}