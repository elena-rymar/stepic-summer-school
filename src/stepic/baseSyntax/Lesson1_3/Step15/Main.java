package stepic.baseSyntax.Lesson1_3.Step15;
import java.util.Scanner;

/*
    Перевод числа из десятичной системы счисления в двоичную
﻿Вводится одно целое число в десятичной системе счисления, необходимо вывести данное число в двоичной системе счисления.

Sample Input 1:

5
Sample Output 1:

101
Sample Input 2:

7
Sample Output 2:

111
Sample Input 3:

12
Sample Output 3:

1100
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a,b=0,c=0;
        a = in.nextInt();
        while(a!=0){
            b++;
            c=c*2+a%2;
            a/=2;
        }
        for(int i=0; i<b;i++){
            System.out.print(c%2);
            c/=2;
        }
        System.out.println();
    }
}
