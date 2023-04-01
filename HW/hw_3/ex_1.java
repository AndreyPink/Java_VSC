// (Дополнительное) Реализовать алгоритм сортировки слиянием

package HW.hw_3;

import java.util.Arrays;
import java.util.Random;

public class ex_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        System.out.println("Отсортированный массив: " + Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1)
            return array;
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else
                result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else
                result[resIn++] = right[rightIn++];

        return result;
    }
}
