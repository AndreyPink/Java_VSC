// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text
// сохранить text в связный список.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// Работать до тех пор, пока не введен stop
// asd
// [asd]
// cvbn
// [asd, cvbn]
// g
// [asd, cvbn, g]
// print~1
// cvbn
// [asd,g]

package Seminars.sem_4;

import java.util.LinkedList;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!str.equals("stop")) {
            System.out.println("Введите строку: ");
            str = sc.nextLine();
            if (str.contains("print~")) {
                int index = Integer.parseInt(str.split("~")[1]);
                System.out.println(ll.get(index));
                ll.remove(index);
            } else {
                ll.add(str);
            }
        }
        sc.close();
    }
}
