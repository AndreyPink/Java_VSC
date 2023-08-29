package Exceptions_HW.HW_2;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class hw2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double dividend = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double divisor = scanner.nextDouble();
            double result = divideNumbers(dividend, divisor);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double divideNumbers(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return dividend / divisor;
    }
}
