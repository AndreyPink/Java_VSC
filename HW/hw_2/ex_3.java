// К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

package HW.hw_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ex_3 {

    public static void logging(String str) {
        String path = "HW/hw_2/log2.txt";
        File logFile = new File(path);
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(str + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = sc.nextInt();
        System.out.println("Введите знак: ");
        String sym = sc.next();
        System.out.println("Введите число 2: ");
        int num2 = sc.nextInt();
        String str = "";
        if (sym.equals("+")) {
            str += num1 + " + " + num2 + " = " + (num1 + num2);
        } else if (sym.equals("-")) {
            str += num1 + " - " + num2 + " = " + (num1 - num2);
        } else if (sym.equals("*")) {
            str += num1 + " * " + num2 + " = " + (num1 * num2);
        } else if (sym.equals("/")) {
            double num_1 = num1;
            double num_2 = num2;
            str += num_1 + " / " + num_2 + " = " + (num_1 / num_2);
        } else {
            System.out.println("Ошибка ввода");
        }
        logging(str);
        System.out.println(str);
        sc.close();
    }
}
