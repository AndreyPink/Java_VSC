package OOP.HW.hw_3;

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
}