package Lectures;

import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[3] = 5;
        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(arr.length);
        System.out.println(arr[3]);

        int[] arr_2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr_2);

        int[][] arr_3 = new int[3][5];
        for (int i = 0; i < arr_3.length; i++) {
            for (int j = 0; j < arr_3[i].length; j++) {
                System.out.printf("X", arr_3[i][j]);
            }
            System.out.println();
        }

        String word = "world";
        System.out.println(word);

        Scanner scan = new Scanner(System.in);
        System.out.printf("input int: ");
        int x = scan.nextInt();
        System.out.printf("input double: ");
        double y = scan.nextDouble();
        System.out.printf("%d, %f", x, y);
        scan.close();
    }
}
