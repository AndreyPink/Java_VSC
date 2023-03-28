// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HW.hw_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ex_2 {

    public static String readFile(String path) {
        String line = "";
        try {
            String str;
            File file = new File(path);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while ((str = bf.readLine()) != null) {
                line += str + "\n";
            }
            bf.close();
            return line;
        } catch (Exception e) {
            return line;
        }
    }

    public static void parser(String line) {
        String[] parseString = line.split("\n");
        for (String string : parseString) {
            String[] studentString = string.split("(:|,)");
            for (int i = 0; i < studentString.length; i++) {
                studentString[i] = studentString[i].replace("\"", "");
            }
            System.out.println("Студент " + studentString[1] + " получил " + studentString[3] + " по предмету "
                    + studentString[5]);
        }
    }

    public static void main(String[] args) {
        String path = "HW/hw_2/school.txt";
        parser(readFile(path));
    }
}
