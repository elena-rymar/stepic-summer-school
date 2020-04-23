package stepic.baseSyntax.Lesson1_4.Step9;
import java.util.Scanner;

/*
    Сортировка массива по возрастанию
Дано натуральное число N, далее следуют N целых чисел. ﻿

Необходимо вывести на консоль отсортированную последовательность.

Sample Input:

5
2 1 3 4 5
Sample Output:

1 2 3 4 5
 */

public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //System.out.println("Введите длину массива: ");
        int n=a.nextInt();
        int arr[]=new int[n];
        //System.out.println("Заполните массив:");
        int c=0;
        while ( c < arr.length){
            arr[c] = a.nextInt();
            c++;
        }

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print (arr[i] + " ");
        }
    }
}
