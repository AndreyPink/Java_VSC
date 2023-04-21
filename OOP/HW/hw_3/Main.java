package OOP.HW.hw_3;


import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Иван", "Петр", "Василий", "Олег", "Михаил" };
        String[] surNames = new String[] { "Иванов", "Петров", "Васильев", "Соколов", "Воробьев" };
        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(25, 50);
        if (random.nextBoolean())
            return new Worker(names[random.nextInt(5)], surNames[random.nextInt(5)], age, salary * index);
        else
            return new Freelancer(names[random.nextInt(5)], surNames[random.nextInt(5)], age, salary * index / 100);

    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();

        }
        System.out.println("Несортированный список:\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------\n");
        System.out.println("Сортировка по ежемесячному доходу:\n");

        Arrays.sort(employees, new SalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------\n");
        System.out.println("Сортировка по имени:\n");

        Arrays.sort(employees, new NameComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------\n");
        System.out.println("Сортировка по возрасту:\n");

        Arrays.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}