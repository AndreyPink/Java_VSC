// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//  которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6
// a b
// ababab

package Seminars.sem_2;

import java.util.Scanner;

public class ex_1 {

    public static String createString(int number, String a, String b) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < number / 2; i++) {
            string.append(a+b);
        }
        return string.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во символов (четное): ");
        int num = sc.nextInt();
        System.out.println("Введите первый символ: ");
        String a = sc.next();
        System.out.println("Введите второй символ: ");
        String b = sc.next();
        System.out.println(createString(num, a, b));
        sc.close();
    }
}
