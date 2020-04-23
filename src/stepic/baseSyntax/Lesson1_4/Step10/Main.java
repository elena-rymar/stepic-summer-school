package stepic.baseSyntax.Lesson1_4.Step10;
import java.util.Scanner;

/*
    Наибольший возрастающий срез массива
Срезом будем считать последовательность подряд идущих элементов массива, где каждый следующий элемент больше предыдущего.

Для последовательности 1 2 3 1 2 5 7 1 2 1 2, существуют возрастающие срезы: 1 2 3, 1 2 5 7, 1 2, 1 2 вывести нужно срез 1 2 5 7

Для последовательности 1 2 3 1 2 5 1 2 7, существуют срезы 1 2 3, 1 2 5, 1 2 7 вывести нужно все срезы, так как они равной длины

Формат входных данных:

Дано натуральное число N, далее следуют N целых чисел.

Формат выходных данных:

В первой строке выведите длину максимального среза

Далее выведите содержание среза/срезов, разделяя элементы одним пробелом, каждый срез с новой строки

Sample Input 1:

7
2 1 2 3 1 5 7
Sample Output 1:

3
1 2 3
1 5 7
Sample Input 2:

5
1 2 3 4 5
Sample Output 2:

5
1 2 3 4 5
Sample Input 3:

7
1 2 1 5 1 7 1
Sample Output 3:

2
1 2
1 5
1 7
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int  max = 1, i, j, counter = 1, flag;
        int N = in.nextInt();
        int [] array = new int [N];


        for (i = 0; i < N; i++)
            array[i] = in.nextInt();

        for (i = 0; i < N - 1; i++) {
            if (array [i] < array [i + 1]) counter++;
            else counter = 1;
            if (counter > max) max = counter;
        }
        System.out.println (max);



        for (i = 0; i < N - max + 1; i++){
            flag = 0;
            for (j = i; j <= i + max - 2; j++){
                if (array [j] < array[j + 1]) flag++;
            }
            if (flag == max - 1) {
                for (j = i; j <= i + max - 1; j++) System.out.print (array [j]+" ");
                System.out.printf ("\n");
            }
        }

    }
}
