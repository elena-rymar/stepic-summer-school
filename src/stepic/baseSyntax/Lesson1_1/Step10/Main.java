package stepic.baseSyntax.Lesson1_1.Step10;
import java.util.Scanner;

/*Ввод чисел
﻿Введите 3 числа. И выведите их через пробел в обратном порядке.

Sample Input 1:

1 2 3
Sample Output 1:

3 2 1
Sample Input 2:

5 1 4
Sample Output 2:

4 1 5
Sample Input 3:

7 9 8
Sample Output 3:

8 9 7
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.printf(c+" "+b+" "+a);

    }
}
