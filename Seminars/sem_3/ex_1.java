// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package Seminars.sem_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ex_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0,100));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
