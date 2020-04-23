package stepic.baseSyntax.Lesson1_2.Step9;
import java.util.Scanner;

/*
    Вычитание
Сколько раз из первого числа можно вычесть второе число?

Sample Input:

5 1
Sample Output:

5
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a/b;
        System.out.print(c);
    }
}
