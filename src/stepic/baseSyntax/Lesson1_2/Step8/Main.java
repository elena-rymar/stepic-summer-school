package stepic.baseSyntax.Lesson1_2.Step8;
import java.util.Scanner;

/*
    Длинные целые
Необходимо вывести остаток от деления первого числа на второе

Sample Input:

55656567464 674764
Sample Output:

8452
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.print(a%b);

    }
}
