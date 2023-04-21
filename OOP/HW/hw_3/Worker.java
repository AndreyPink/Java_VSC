package OOP.HW.hw_3;

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