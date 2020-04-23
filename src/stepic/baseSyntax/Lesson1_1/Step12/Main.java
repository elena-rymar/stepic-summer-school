package stepic.baseSyntax.Lesson1_1.Step12;
import java.util.Scanner;

/*
    Вывод трех строк
Вводится три числа a, b, c, необходимо вывести три строки:
Если a=1, b = 2, c = 3
1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
Sample Input:

1 2 3
Sample Output:

1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
        System.out.println(a+" * "+b+" * "+c+" = "+(a*b*c));
        System.out.println("("+a+" + "+b+")"+" * "+c+" = "+((a+b)*c));

    }
}
