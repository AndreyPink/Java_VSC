// (ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

// РАБОТАЕТ С ЛЮБЫМИ ЧИСЛАМИ !!!!!

package HW.hw_1;

import java.util.Scanner;

public class ex_4 {

    public static int convert(String num, int j) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {

            if (Character.isDigit(num.toCharArray()[i]))
                string.append(num.toCharArray()[i]);
            else
                string.append(j);
        }
        int newNum = Integer.parseInt(string.toString());
        return newNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Введите первое слагаемое: ");
        String a = sc.nextLine();
        System.out.println("Введите второе слагаемое: ");
        String b = sc.nextLine();
        System.out.println("Введите сумму слагаемых: ");
        String c = sc.nextLine();

        for (int j = 0; j < 10; j++) {

            if (convert(a, j) + convert(b, j) == convert(c, j)) {
                System.out.printf("Решение данного уравнения: %d + %d = %d\n", convert(a, j), convert(b, j),
                        convert(c, j));
                check = true;
            }
        }
        if (check == false)
            System.out.println("У данного уравнения нет решения");
        sc.close();
    }
}