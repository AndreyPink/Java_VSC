// Вывести все простые числа от 1 до 1000

package HW.hw_1;

public class ex_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.printf("%d ", i);
            count = 0;
        }
    }
}
