package stepic.baseSyntax.Lesson1_3.Step12;
import java.util.Scanner;

/*
    1.3 Условия и циклы
Кратности числа
Дано число, необходимо вывести все кратности данного числа через пробел, включая единицу и само число.

Sample Input 1:

8
Sample Output 1:

1 2 4 8
Sample Input 2:

5
Sample Output 2:

1 5
Sample Input 3:

7
Sample Output 3:

1 7
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a/2 ; i++)
            if (a % i == 0)
                System.out.print(i + " ");
        System.out.print(a);
    }
}