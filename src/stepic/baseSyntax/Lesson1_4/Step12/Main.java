package stepic.baseSyntax.Lesson1_4.Step12;
import java.util.Scanner;

/*
    Ввод строк
Программа получает на вход две строки.

Необходимо вывести строку, меньшую в лексографическом порядке.

Sample Input 1:

mother brother
Sample Output 1:

brother
Sample Input 2:

look picture
Sample Output 2:

look
Sample Input 3:

cook soup
Sample Output 3:

cook
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String a = in.next();
        String b = in.next();

        int result = a.compareTo(b);

        if (result>0) System.out.println(b);
        else System.out.println(a);

    }
}