package stepic.baseSyntax.Lesson1_4.Step14;
import java.util.Scanner;

/*
    Сплит
Дана строка вида термин - определение1, определение2, определение3, .....

Необходимо вывести ответ в формате:

Термин:

-определение1

-определение2

-определение3

Sample Input 1:

banana - a, b, c, d, e
Sample Output 1:

banana:
-a
-b
-c
-d
-e
Sample Input 2:

aa - asaf, asf, asff, asfasf, asfasf, asfasf
Sample Output 2:

aa:
-asaf
-asf
-asff
-asfasf
-asfasf
-asfasf
Sample Input 3:

abc - a, b
Sample Output 3:

abc:
-a
-b
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(", | - ");
        System.out.println(str[0]+ ":");

        for(int i = 1; i < str.length; i++) {
            System.out.println("-" + str[i].replace(",",""));
        }
    }
}
