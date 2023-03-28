// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

package Seminars.sem_2;

import java.util.Scanner;

public class ex_2 {

    public static String compressString(String str) {
        if (str.length() < 2)
            return str;
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                count += 1;
            } else {
                result.append(charArray[i - 1]);
                if (count != 1) {
                    result.append((count));
                }
                count = 1;
            }
        }
        result.append(charArray[charArray.length - 1]);
        if (count != 1)
            result.append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из символов: ");
        String myString = sc.nextLine();
        System.out.println(compressString(myString));
        sc.close();
    }
}
