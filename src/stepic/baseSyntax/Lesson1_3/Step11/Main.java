package stepic.baseSyntax.Lesson1_3.Step11;
import java.util.Scanner;

/*
    Числа от 1 до N
Программа получает на вход натуральное число N, при чем N не превосходит 1000

Программа должна вывести все числа от 1 до N через пробел, включая границы.

Если N = 1, необходимо вывести одну 1!

Sample Input 1:

1
Sample Output 1:

1
Sample Input 2:

5
Sample Output 2:

1 2 3 4 5
Sample Input 3:

7
Sample Output 3:

1 2 3 4 5 6 7
 */

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
}
