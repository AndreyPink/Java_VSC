package temples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class iter {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = linkedList.iterator();
        int sum = 0;

        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println(sum);
    }
}