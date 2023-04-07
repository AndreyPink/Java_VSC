// Написать программу, определяющую правильность расстановки скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(]3*3) - ложь

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь


package Seminars.sem_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ex_3 {
    public static void main(String[] args) {
        String str = "<{a}+{(d*3)}>";
        System.out.println(check(str));
    }
    static boolean check(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        String[] c1 = new String[]{"()", "{}", "[]", "<>"};
        for (int i = 0; i < c1.length; i++) {
            String a = c1[i];
            map.put(a.charAt(1), a.charAt(0));
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.containsValue(chars[i])){
                stack.push(chars[i]);
            }
            if (map.containsKey(chars[i])){
                if (stack.empty() || map.get(chars[i]) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
