package OOP.Seminars.sem_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ex_2 {

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
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------");
        System.out.println("Сортировка по ежемесячному доходу:\n");

        Arrays.sort(employees, new SalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------");
        System.out.println("Сортировка по имени:\n");

        Arrays.sort(employees, new NameComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n------------------------------------");
        System.out.println("Сортировка по возрасту:\n");

        Arrays.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        // return o1.calculateSalary() == o2.calculateSalary() ? 0 :
        // (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.age, o2.age);
    }
}

abstract class Employee {

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; среднемесячная з/п: %.2f", name, surName, salary);
    }

    // @Override
    // public int compareTo(Employee o) {
    // return Double.compare(calculateSalary(), o.calculateSalary());
    // }

}

class Worker extends Employee {

    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);

    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; %d лет; Рабочий; фиксированная з/п за месяц: %.2f", name, surName, age,
                salary);
    }

    @Override
    public double calculateSalary() {
        return salary;

    }

}

class Freelancer extends Employee {

    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);

    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 5;
    }

    @Override
    public String toString() {
        return String.format(
                "Сотрудник: %s %s; %d лет; Фрилансер; почасовая з/п: %.2f; средняя з/п за месяц (100 часов): %.2f",
                name, surName, age, salary, calculateSalary());
    }

}