package OOP.HW.hw_3;

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