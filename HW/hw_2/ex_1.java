// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package HW.hw_2;

import java.util.Scanner;

public class ex_1 {

    public static int[] bubbleSortArray(int[] array) {
        int temp;
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length - j; i++) {
                if(array[i] < array[i-1]){
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
        // тут записываем в файл 
    }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив из цифр через пробел: ");
        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];
        for (int i = 0; i < array.length; i++) {
            // array[i] = Character.digit(arrayString[i].charAt(0), 10);
            array[i] = Integer.parseInt(arrayString[i]);
    }
    sc.close();
    for (int elem : bubbleSortArray(array)) {
        System.out.print(elem + " ");
    }
}
}