// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.
// решить нужно без использования дополнительного массива, 
// а только перестановкой элементов.

package Seminars.sem_1;

public class ex_2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 3, 4, 3, 2, 3 };
        int val = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == val) {
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }

        }
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

}
