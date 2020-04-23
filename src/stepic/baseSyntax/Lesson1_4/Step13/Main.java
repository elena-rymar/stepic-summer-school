package stepic.baseSyntax.Lesson1_4.Step13;
import java.util.Scanner;

/*
    Слова от a до h
﻿Вводится одна строка целиком. Необходимо вывести те слова данной строки, которые начинаются с буквы из интервала от a до h.

Словом считается совокупность букв и символов от пробела до пробела. Слова могут быть как в верхнем, так и нижнем регистре.

Выводить слова необходимо каждый раз с новой строки.

Sample Input 1:

I'm in my penthouse half naked I cooked this meal for you naked
Sample Output 1:

half
cooked
for
Sample Input 2:

The following is a true story Only the names have been changed To protect the guilty Well I left my job in my home town
Sample Output 2:

following
a
have
been
changed
guilty
home
Sample Input 3:

The bartender's working on a Late night shift She's bonka blonds and Bon Aims on a midnight drift
Sample Output 3:

bartender's
a
bonka
blonds
and
Bon
Aims
a
drift
 */


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char letter;
        String[]c = a.split("\\s");

        for(int i = 0; i < c.length; i++) {
            letter = c[i].charAt(0);
            if (letter >= 'a' && letter <= 'h')
                System.out.println(c[i]);
            else if (letter >= 'A' && letter <= 'H')
                System.out.println(c[i]);
        }
    }
}
