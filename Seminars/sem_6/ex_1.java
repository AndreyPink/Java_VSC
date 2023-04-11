// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.


package Seminars.sem_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex_1 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        Set<Integer> ls = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        Set<Integer> ts = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        Set<Integer> lls = new LinkedHashSet<>(ts);

        System.out.println(hs);
        System.out.println(ls);
        System.out.println(ts);
        System.out.println(lls);
    }
}
