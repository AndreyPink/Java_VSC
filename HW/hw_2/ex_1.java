// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package HW.hw_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ex_1 {

    public static void logging(int[] array, int iter) {
        String path = "HW/hw_2/log.txt";
        File logFile = new File(path);
        StringBuilder sb = new StringBuilder();
        for (int elem : array)
            sb.append(elem + " ");
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write("Iter" + iter + ":  [" + sb.toString() + "]\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static int[] bubbleSortArray(int[] array) {
        int temp;
        for (int j = 0; j < array.length -1; j++) {
            for (int i = 1; i < array.length - j; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            logging(array, j+1);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив из цифр через пробел: ");
        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }
        sc.close();
        System.out.println("Итоговый массив: ");
        for (int elem : bubbleSortArray(array)) {
            System.out.print(elem + " ");
        }
    }
}