// (Дополнительное) Реализовать алгоритм сортировки слиянием

package HW.hw_3;

import java.util.Arrays;
import java.util.Random;

public class ex_1_old {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        ex_1_old m = new ex_1_old();
        m.mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
    
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
        int leftI = 0, rightI = 0, resI = 0;
        while (leftI < leftArr.length && rightI < rightArr.length) {
            if (leftArr[leftI] <= rightArr[rightI]) {
                resultArray[resI] = leftArr[leftI];
                leftI++;
            } else {
                resultArray[resI] = rightArr[rightI];
                rightI++;
            }
            resI++;
        }
        while (leftI < leftArr.length) {
            resultArray[resI] = leftArr[leftI];
            leftI++;
            resI++;
        }

        while (rightI < rightArr.length) {
            resultArray[resI] = rightArr[rightI];
            rightI++;
            resI++;
        }
    }
}
