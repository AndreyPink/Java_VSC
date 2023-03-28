// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

package Seminars.sem_2;

import java.util.Scanner;

public class ex_3 {


    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) 
            if (charArray[i] != charArray[charArray.length - i - 1]) 
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("ВВедите строку: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(isPalindrome(string)? "Палиндром" : "Не палиндром");
        sc.close();

    }
}
