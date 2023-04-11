// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package HW.hw_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("Apple", 16, 512, "MacOs", "silver");
        Notebook n2 = new Notebook("Dell", 8, 256, "Windows", "black");
        Notebook n3 = new Notebook("Asus", 4, 128, "Linux", "red");
        Notebook n4 = new Notebook("Lenovo", 8, 512, "Windows", "black");
        Notebook n5 = new Notebook("Apple", 32, 1024, "MacOs", "grey");
        ArrayList<Notebook> list = new ArrayList<>(Arrays.asList(n1, n2, n3, n4, n5));

        choiseNotebook(list, filter());
    }

    public static HashMap<String, Object> filter() {
        Scanner sc = new Scanner(System.in);
        // Map<String, Object> custom = Map.of("ram", 0, "hdd", 0, "os", " ", "color", "
        // ");
        HashMap<String, Object> custom = new HashMap<String, Object>();
        custom.put("ram", 0);
        custom.put("hdd", 0);
        custom.put("os", " ");
        custom.put("color", " ");
        System.out.println("Приступаем к подбору оптимальной модели ноутбука\n");
        while (true) {
            System.out.println("1. Объем RAM");
            System.out.println("2. Объем HDD");
            System.out.println("3. OS");
            System.out.println("4. Цвет");
            System.out.println("0. Завершить фильтрацию и вывести подходящую модель ");
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите минимальный объем RAM: ");
                    int ram = sc.nextInt();
                    custom.put("ram", ram);
                    break;

                case 2:
                    System.out.println("Введите минимальный объем HDD: ");
                    int hdd = sc.nextInt();
                    custom.put("hdd", (Integer) hdd);
                    break;

                case 3:
                    System.out.println("Выберите OS из списка\n");
                    System.out.println("1. Windows");
                    System.out.println("2. Linux");
                    System.out.println("3. MacOS");
                    System.out.println("Введите цифру, соответствующую необходимому критерию: ");
                    int choiceOs = sc.nextInt();
                    switch (choiceOs) {
                        case 1:
                            custom.put("os", "Windows");
                            break;
                        case 2:
                            custom.put("os", "Linux");
                            break;
                        case 3:
                            custom.put("os", "MacOS");
                            break;
                        default:
                            System.out.println("Ошибка выбора");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Введите цвет: ");
                    String color = sc.next();
                    custom.put("color", color);
                    break;

                case 0:
                    sc.close();
                    return custom;

                default:
                    System.out.println("Ошибка выбора");
                    break;
            }

        }
        
    }

    public static void choiseNotebook(ArrayList<Notebook> list, HashMap<String, Object> filter) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRam() < (Integer) filter.get("ram") &&
                    list.get(i).getHdd() < (Integer) filter.get("hdd") &&
                    !list.get(i).getOs().equals((String) filter.get("os"))
                    || !filter.get("os").equals(" ") &&
                            !list.get(i).getColor().equals((String) filter.get("color"))
                    || !filter.get("color").equals(" ")) {
                list.remove(i);
            }
        }
        if (list.size() == 0)
            System.out.println("Ноутбук под ваши параметры не найден.");
        else {
            for (int index = 0; index < list.size(); index++) {
                System.out.println(list.get(index));
            }
        }
    }
}