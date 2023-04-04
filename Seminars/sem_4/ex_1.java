// 1. Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2. Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.


package Seminars.sem_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex_1 {

public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<>();
    long startA = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
        arrList.add(0,i);
    }
    long stopA = System.currentTimeMillis();
    System.out.println(stopA-startA);

    LinkedList<Integer> linkedList = new LinkedList<>();
    long startB = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
        linkedList.add(0,i);
    }
    long stopB = System.currentTimeMillis();
    System.out.println(stopB-startB);
}
    
}