package HW.hw_1;

import java.util.Scanner;

public class ex_4_new {

    public static int convert(String num, int j) {
        int[] Mas = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {

            if (Character.isDigit(num.toCharArray()[i]))
                Mas[i] = Character.digit(num.toCharArray()[i], 10);
            else
                Mas[i] = j;
        }
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < Mas.length; i++)
            string.append(Mas[i]);
        int newNum = Integer.parseInt(string.toString());
        return newNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Введите первое двузначное слагаемое: ");
        String a = sc.nextLine();
        System.out.println("Введите второе двузначное слагаемое: ");
        String b = sc.nextLine();
        System.out.println("Введите двузначную сумму слагаемых: ");
        String c = sc.nextLine();

        for (int j = 0; j < 10; j++) {

            if (convert(a, j) + convert(b, j) == convert(c, j)) {
                System.out.printf("Решение данного уравнения: %d + %d = %d", convert(a, j), convert(b, j),
                        convert(c, j));
                check = true;
            }
        }
        if (check == false)
            System.out.println("У данного уравнения нет решения");
        sc.close();
    }
}