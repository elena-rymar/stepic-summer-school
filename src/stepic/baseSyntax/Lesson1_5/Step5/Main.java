package stepic.baseSyntax.Lesson1_5.Step5;

/*
    Легкий палиндром
Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»), пе́ревертень[1] — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Берем исходную строку и к ней добавляем ее же, но в обратном порядке.

Например дано abcde, тогда ответ abcdeedcba

Sample Input 1:

abcde
Sample Output 1:

abcdeedcba
Sample Input 2:

mymedicine
Sample Output 2:

mymedicineenicidemym
Sample Input 3:

easyprogramm
Sample Output 3:

easyprogrammmmargorpysae
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a = in.next().split("");

        ArrayList<String> alis = new ArrayList<String>();
        alis.addAll(Arrays.asList(a)); //разбили строку на список

        for (int i = 0; i <alis.size() ; i++) {
            System.out.print(alis.get(i));
        }
        Collections.reverse(alis); //развернули
        for (int i = 0; i <alis.size() ; i++) {
            System.out.print(alis.get(i));
        }
    }
}
