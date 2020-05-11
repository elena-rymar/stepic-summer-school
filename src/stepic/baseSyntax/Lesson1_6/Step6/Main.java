package stepic.baseSyntax.Lesson1_6.Step6;
import java.util.Scanner;

/*
    Развлекаемся с суммой
Реализуйте функцию, возвращающую сумму двух чисел. Менять сигнатуру функции не нужно. Писать что то кроме функции - не нужно! Задумываться о вводе тоже не нужно!

Sample Input 1:

8 11
Sample Output 1:

19
Sample Input 2:

1 2
Sample Output 2:

3
Sample Input 3:

5 5
Sample Output 3:

10

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a,b));

    }

    static int sum(int a, int b){
        return a+b;
    }

}
