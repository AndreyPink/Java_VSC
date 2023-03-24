// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HW.hw_1;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arProgr = 1; 
        int geProgr = 1;
        for (int i = 2; i <= num; i++) {
            arProgr += i;
            geProgr *= i;
        }
System.out.printf("Сумма арифм прогрессии = %d\n", arProgr);
System.out.printf("Сумма геометр прогрессии = %d\n", geProgr);
sc.close();
    }
    
}
