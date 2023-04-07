// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//  Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "baar"
// f: b
// o: a


// Output: false

// Пример 2:

// Input: s = "paper", t = "title"
// p: t
// a: i
// e: l
// r: e

// Output: true


package Seminars.sem_5;

import java.util.HashMap;
import java.util.Map;

public class ex_2 {
    public static void main(String[] args) {
        String st1 = "paper";
        String st2 = "title";
        if (st1.length() != st2.length())
            System.out.println(false);
        else 
            System.out.println(isIsomorph(st1, st2));
    }

        
    public static boolean isIsomorph(String str1, String str2 ){
        Map<Character, Character> hm = new HashMap<>();
        for (var i = 0; i < str1.length(); i++) {
            if (hm.containsKey(str1.charAt(i)) && hm.get(str1.charAt(i)) != str2.charAt(i))
                    return false;
            else
                hm.put(str1.charAt(i), str2.charAt(i));
        }
        return true;
    }
}
