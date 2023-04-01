// (Дополнительное) Реализовать алгоритм сортировки слиянием

package HW.hw_3;

import java.util.Arrays;
import java.util.Random;

public class ex_1 {

    public void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    public void merge(int[] leftArr, int[] rightArr, int[] resultArray) {
        int left = 0, right = 0, res = 0;
        while (left < leftArr.length && right < rightArr.length) {
            if (leftArr[left] <= rightArr[right]) {
                resultArray[res] = leftArr[left];
                left++;
            } else {
                resultArray[res] = rightArr[right];
                right++;
            }
            res++;
        }
        while (left < leftArr.length) {
            resultArray[res] = leftArr[left];
            left++;
            res++;
        }

        while (right < rightArr.length) {
            resultArray[res] = rightArr[right];
            right++;
            res++;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        ex_1 m = new ex_1();
        m.mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
