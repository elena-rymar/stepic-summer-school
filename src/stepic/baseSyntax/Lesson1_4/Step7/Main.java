package stepic.baseSyntax.Lesson1_4.Step7;


/*
    Обработка данных массива
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.

Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.

А если таких чисел в массиве нет, необходимо вывести -1.

Sample Input 1:

5
100 96 -2 96 1
Sample Output 1:

96 96
Sample Input 2:

7
1 2 3 4 5 6 7
Sample Output 2:

-1
Sample Input 3:

8
98 -98 98 -98 56 56 56 56
Sample Output 3:

98 98 56 56 56 56
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        int i, counter = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = in.nextInt();
            if ((array[i] > 9) && (array[i] < 100) && (array[i] % 2 == 0)) {
                System.out.print(array[i] + " ");
                counter++;
            }
        }
        if (counter==0){System.out.print("-1");}
    }
}
