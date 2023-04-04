// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

package HW.hw_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ex_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reversArray(ll));
    }

    public static ArrayList reversArray(LinkedList ll) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            array.add((Integer) ll.get(i));
        }
        return array;
    }
}
