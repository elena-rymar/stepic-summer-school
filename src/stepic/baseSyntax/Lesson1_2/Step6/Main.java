package stepic.baseSyntax.Lesson1_2.Step6;
import java.util.Scanner;

/*
    Сумма букв
﻿Вводятся две букв необходимо вывести сумму кодов этих букв

Sample Input:

a b
Sample Output:

195
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = System.in.read();
        char b = (char) System.in.read();
        int c = System.in.read();
        System.out.println(a+c);
    }
}
