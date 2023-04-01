// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Seminars.sem_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ex_3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(1, "y", 2, "t", 3, "u", 4, 5));
        Iterator<Object> iter = list.iterator();
        while (iter.hasNext()) {
        if (iter.next() instanceof Integer) {
        iter.remove();
        }
        }

        // for (int i = list.size()-1; i >= 0; i--) {
        // if (list.get(i) instanceof Integer) {
        // list.remove(i);
        // }
        // }

        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer) {
        //         list.remove(i);
        //         i--;
        //     }
        // }
        // System.out.println(list);
    }
}
