package stepic.baseSyntax.Lesson1_6.Step7;
import java.util.Scanner;

/*
    printN
﻿Реализуйте процедуру, которая выводит на экран последовательность в соответствии с условием.

Sample Input 1:

3
Sample Output 1:

122333
Sample Input 2:

4
Sample Output 2:

1223334444
Sample Input 3:

2
Sample Output 3:

122
 */

public class Main {
    static int c = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("st "+ printN(n));
    }
    static int printN(int n) {
        System.out.println(printN(n));
        c++;

        System.out.println(c);
        return n < 2 ? 1 : printN(n-1) + printN(n-2);
    }
}
