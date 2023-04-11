// 1. Напишите метод, который заполнит массив из 110 элементов случайными цифрами от 0 до 70.

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных 
// значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Seminars.sem_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ex_2 {
    public static void main(String[] args) {
        unique(ListCreate());

    }

    public static ArrayList<Integer> ListCreate() {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 110; i++) {
            list.add(rand.nextInt(0, 70));
        }
        // System.out.println(list.toString());
        return list;
    }
    public static void unique(ArrayList<Integer> list) {
        Set<Integer> hs = new HashSet<>();
        for (Integer elem : list) {
            hs.add(elem);
        }
        // System.out.println(hs.toString());
        double percent = (double) hs.size()*100/list.size();
        System.out.print(percent);
    }
}
