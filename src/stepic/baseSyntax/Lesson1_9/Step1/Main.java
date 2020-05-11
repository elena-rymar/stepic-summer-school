package stepic.baseSyntax.Lesson1_9.Step1;
import java.util.Scanner;
import java.util.*;

/*
    Дан следующий фрагмент кода:

TreeSet<SomeClass> set = new TreeSet<>();
set.addAll(...);
for(SomeClass i : set) System.out.print(i + " ");
где SomeClass - некий ссылочный тип данных.
В множество добавляется коллекция, необходимо определить, что выведет программа
Правильных ответов - 4

  {1, 7, 12, 3, 3, 3, 4} программа выведет 1 3 3 3 4 7 12
* {"aa", "ab", "Ac", "BBB"} программа выведет Ac BBB aa ab
* {12, 33333, 7, 130} программа выведет 7 12 130 33333
  {"12", "33333", "7", "130"} программа выведет 7 12 130 33333
  {"aa", "ab", "Ac", "BBB"} программа выведет aa ab Ac BBB
* {"12", "33333", "7", "130"} программа выведет 12 130 33333 7
* {1, 12, 12, 3, 5, 7} программа выведет 1 3 5 7 12

 */

public class Main {
    public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            System.out.print("Ведиите буквы через пробел\n");
            String st1 = vvod.nextLine();
            otv(st1);
            System.out.println("\nВведите числа через пробел");
            String st2 = vvod.nextLine();
            otv2(st2);
            System.out.println("\nВведите числа через пробел");
            String st3 = vvod.nextLine();
            otv(st3);
        }
        static void otv(String st1){
            TreeSet <String> arl = new TreeSet<String>();
            arl.addAll(Arrays.asList(st1.split(" ")));
            for (String s:arl){
                System.out.print(s+" ");
            }
        }
        static void otv2(String st2){
            TreeSet <Integer> arl = new TreeSet<Integer>();
            String [] m1=st2.trim().split(" ");
            int [] m2 = new int[m1.length];
            for(int i =0; i<m2.length;i++){m2[i]= Integer.parseInt( m1[i]);}
            for(int i=0;i<m2.length;i++) {
                arl.add(m2[i]);
            }
            for(int i : arl){
                System.out.print(i+" ");
            }
        }
    }
