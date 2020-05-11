package stepic.baseSyntax.Lesson1_8.Step4;
import java.util.Scanner;

/*
    НОД (Наибольший общий делитель ) двух чисел
Sample Input 1:

5465151651561565656151 1151651651651
Sample Output 1:

1
Sample Input 2:

1235615652146561624516 5156656516523
Sample Output 2:

1
Sample Input 3:

111111111111111111111111111111111111111111111111 111111111111111111111111111111
Sample Output 3:

111111
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(in.nextBigInteger().gcd(in.nextBigInteger()));

    }
}
