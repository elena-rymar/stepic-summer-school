package stepic.baseSyntax.Lesson1_3.Step16;
import java.util.Scanner;

/*
    Сумма членов арифметической прогрессии
Программа получает на вход число N, необходимо вывести сумму всех чисел от 1 до N.

N не превосходит 10^910
9


Сумма арифметической прогрессии:

https://ru.wikipedia.org/wiki/%D0%90%D1%80%D0%B8%D1%84%D0%BC%D0%B5%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%...

Sample Input 1:

10
Sample Output 1:

55
Sample Input 2:

30
Sample Output 2:

465
Sample Input 3:

1000000
Sample Output 3:

500000500000
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long sum=n*(n+1)/2;
        System.out.println(sum);
    }
}