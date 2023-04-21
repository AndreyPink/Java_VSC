package OOP.Seminars.sem_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ex_2 {

    private static Random random = new Random();

    static String[] names = new String[] { "Ivan", "Petr", "Vasya", "Oleg", "Mikhail" };
    static String[] surNames = new String[] { "Ivanov", "Petrov", "Vasilyev", "Sokolov", "Vorobyev" };

    static Worker generateWorker() {
        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        return new Worker(names[random.nextInt(5)], surNames[random.nextInt(5)], salary * index);
    }

    static Freelancer generateFreelancer() {
        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        return new Freelancer(names[random.nextInt(5)], surNames[random.nextInt(5)], salary * index / 100);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            if (random.nextBoolean())
                employees[i] = generateWorker();
            else
                employees[i] = generateFreelancer();
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Arrays.sort(employees, new SalaryComparator());
        // Arrays.sort(employees, new NameComparator());
        System.out.println("------------------------------------");
        System.out.println("Отсортированный список:\n");

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}

// class SalaryComparator implements Comparator<Employee> {

// @Override
// public int compare(Employee o1, Employee o2) {

// // return o1.calculateSalary() == o2.calculateSalary() ? 0 :
// // (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
// return Double.compare(o1.calculateSalary(), o2.calculateSalary());
// }
// }

// class NameComparator implements Comparator<Employee> {

// @Override
// public int compare(Employee o1, Employee o2) {
// return o1.name.compareTo(o2.name);
// }
// }

abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected double salary;

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; среднемесячная з/п: %.2f", name, surName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }

}

class Worker extends Employee {

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);

    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Рабочий; фиксированная з/п за месяц: %.2f", name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;

    }

}

class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);

    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 5;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Фрилансер; почасовая з/п: %.2f; средняя з/п за месяц (100 часов): %.2f", name, surName, salary, calculateSalary());
    }

}