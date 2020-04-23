package stepic.baseSyntax.Lesson1_3.Step13;
import java.util.Scanner;

/*
    Цифры в числе
Дано число, необходимо вывести два числа через пробел. Первое число - количество нечетных цифр данного числа, второе число - произведение четных цифр данного числа. Если четных цифр в числе нет - произведение 0.

Sample Input 1:

1345
Sample Output 1:

3 4
Sample Input 2:

156165
Sample Output 2:

4 36
Sample Input 3:

51212121
Sample Output 3:

5 8
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b=0, chet=1, nechet=0;
        while (a > 0){
            b=a%10;
            if(b%2==0) {
                chet*=b;
            }else {
                nechet++;
            }
            a /= 10;
        }
        if (chet == 1) chet =0;
        System.out.print(nechet+" "+chet);
    }
}