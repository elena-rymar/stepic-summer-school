package stepic.baseSyntax.Lesson1_5.Step6;
import java.util.Scanner;

/*
    Обработка списка
Существует ряд методов для класса ArrayList: add(n) - вставка в конец, add(i, n) - вставка по индексу, remove(i) - удаление по индексу, set(i, n) - изменение значения по индексу.

На вход программе подаются строки, первая из которых create N - создает исходный список с числами от 1 до N включительно. Сигнатуры остальных команд:

add 5 - вставляет 5 в конец списка

add 5 6 - вставляет 6 по индексу 5

remove 7 - удаляет 7 элемент списка

set 7 3 - заменяет значение седьмого элемента списка на 3

Команда printList - сигнализирует о конце ввода данных и должна вывести на экран список, полученный после всех манипуляций

Sample Input 1:

create 30
add 12
add 17
add 3 15
remove 4
set 12 34
printList
Sample Output 1:

1 2 3 15 5 6 7 8 9 10 11 12 34 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 12 17
Sample Input 2:

create 60
add 12
add 13
add 14
add 15
add 1 16
add 2 17
add 3 18
add 4 19
add 5 20
remove 60
remove 50
remove 40
set 17 30
set 18 19
printList
Sample Output 2:

1 16 17 18 19 20 2 3 4 5 6 7 8 9 10 11 12 30 19 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 37 38 39 40 41 42 43 44 45 47 48 49 50 51 52 53 54 55 57 58 59 60 12 13 14 15
Sample Input 3:

create 10
add 11
add 13
add 17
add 19
printList
Sample Output 3:

1 2 3 4 5 6 7 8 9 10 11 13 17 19
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Hello World!");

    }
}
