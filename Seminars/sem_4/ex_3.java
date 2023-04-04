// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// asd
// zxc
// qwe
// print
// qwe
// zxc
// asd
// []

package Seminars.sem_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("Введите строку: ");
            str = sc.nextLine();
            if (str.equals("print")) {
                // for (int i = deque.size() - 1; i >= 0; i--) {
                //     System.out.println(deque.removeLast());
                // }
                while(!deque.isEmpty()) {
                System.out.println(deque.removeLast());
                }
                break;
            } else {
                deque.addLast(str);
            }
        }
        sc.close();
    }
}


        // Stack<String> stack = new Stack<>();
        // Scanner scanner = new Scanner(System.in);
        // String s = scanner.nextLine();

        // while (!s.equals("stop")){
        //     switch (s){
        //         case "print":
        //             while (!stack.empty()){
        //                 System.out.println(stack.pop());
        //             }
        //             break;
        //         default:
        //             stack.push(s);
        //     }
        //     s = scanner.nextLine();
        // }