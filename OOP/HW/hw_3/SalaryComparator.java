package OOP.HW.hw_3;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        // return o1.calculateSalary() == o2.calculateSalary() ? 0 :
        // (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}