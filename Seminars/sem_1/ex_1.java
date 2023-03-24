// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Seminars.sem_1;

public class ex_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int max_count = 0;
        int count = 0;

        for (int elem : arr) {
            if (elem == 1) {
                count++;
                if (count > max_count)
                    max_count = count;
            } 
            else count = 0;
        }
        System.out.println(max_count);
    }
}
