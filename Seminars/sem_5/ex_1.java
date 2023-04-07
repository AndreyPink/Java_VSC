// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.


package Seminars.sem_5;

import java.util.HashMap;
import java.util.Map;

public class ex_1 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(123456, "Иванов");
        hm.put(321456, "Васильев");
        hm.put(234561, "Петрова");
        hm.put(234432, "Иванов");
        hm.put(654321, "Петрова");
        hm.put(345678, "Иванов");
        for (var item: hm.entrySet()) {
            if (item.getValue().equals("Иванов")){
                System.out.println(item.getKey() + " " + item.getValue());
            }
        }
    }
}
