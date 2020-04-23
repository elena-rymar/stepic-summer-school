package stepic.baseSyntax.Lesson1_3.Step14;
import java.util.Scanner;

/*
    Минимум бесконечной последовательности
Дана некоторая последовательность целых чисел. Необходимо вывести минимум этой последовательности.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10 11 12 13 14
Sample Output 1:

1
Sample Input 2:

5 5 5 5 5 5 2 3 6 8 7 4 5 6 9 8 5 1 2 5 564 564 564 654 564 564 684 56 54 864 864 8 486
Sample Output 2:

1
Sample Input 3:

65456 454 564 561 51 684 84 8484 5 49 48 498 48 48 4 89 489 4 498 4 984 984 89 498 498
Sample Output 3:

4
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        while (in.hasNextInt()) {
            int i = in.nextInt();
            min = Math.min(min, i);

            if (!in.hasNextInt()) {
                System.out.println(min);
            }
        }

    }
}
