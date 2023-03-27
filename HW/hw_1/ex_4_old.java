// (ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package HW.hw_1;

import java.util.Scanner;

public class ex_4_old {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Введите первое двузначное слагаемое: ");
        String a = sc.nextLine();
        System.out.println("Введите второе двузначное слагаемое: ");
        String b = sc.nextLine();
        System.out.println("Введите двузначную сумму слагаемых: ");
        String c = sc.nextLine();

        int[] newMas = new int[6];

        char[] Mas = (a + b + c).toCharArray();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < Mas.length; i++) {
                if (Character.isDigit(Mas[i])) {
                    newMas[i] = Character.digit(Mas[i], 10);
                } else
                    newMas[i] = j;
            }
            if ((newMas[0] * 10 + newMas[1]) + (newMas[2] * 10 + newMas[3]) == newMas[4] * 10 + newMas[5]) {
                System.out.printf("Решение данного уравнения: %d + %d = %d", (newMas[0] * 10 + newMas[1]),
                        (newMas[2] * 10 + newMas[3]), (newMas[4] * 10 + newMas[5]));
                check = true;
            }
        }
        if (check == false)
            System.out.println("У данного уравнения нет решения");
        sc.close();
    }
}
