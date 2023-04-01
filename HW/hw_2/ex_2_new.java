// Дана json строка [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}] 

// 1.Задача написать метод(ы), который распарсить строку и выдаст ответ вида: 
// Студент Иванов получил 5 по предмету Математика. 
// Студент Петрова получил 4 по предмету Информатика. 
// Студент Краснов получил 5 по предмету Физика. 
// Используйте StringBuilder для подготовки ответа.

// 2. Создать метод, который запишет результат работы в файл 
// Обработайте исключения и запишите ошибки в лог файл.


package HW.hw_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ex_2_new {

    public static String readFile(String path) {
        String line = "";
        try {
            File file = new File(path);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            line = bf.readLine();
            bf.close();

            System.out.println(line); // печать строки, которую ты достал из файла

            return line;
        } catch (Exception e) {
            return line;
        }
    }

    public static void parser(String line) {
        
        String[] text = new String[] {"Студент", "получил", "по предмету"};
        String[] parseString = line.split("},");
        for (String string : parseString) {
            String[] studentString = string.split("(:|,|}])");
            for (int i = 0; i < studentString.length; i++) {
                studentString[i] = studentString[i].replace("\"", "");
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length; i++) {
                sb.append(text[i] + " ");
                sb.append(studentString[i*2 + 1] + " ");
            }
            System.out.println(sb.toString());
            writeFile(sb.toString());
        }
    }

    public static void writeFile(String str) {
        String path = "HW/hw_2/ex2_new_result.txt";
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
        String path = "HW/hw_2/json.json";
        parser(readFile(path));
    }
}
