// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package HW.hw_1;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = sc.nextInt();
        System.out.println("Введите знак: ");
        String sym = sc.next();
        System.out.println("Введите число 2: ");
        int num2 = sc.nextInt();

        System.out.println("/" + sym + "/");

        if (sym == "+") {
            System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        } else if (sym == "-") {
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        } else if (sym == "*") {
            System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        } else if (sym == "/") {
            System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        } else {
            System.out.println("Ошибка ввода");
        }
        sc.close();
    }
}
