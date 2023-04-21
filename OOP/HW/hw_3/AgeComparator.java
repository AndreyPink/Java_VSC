package OOP.HW.hw_3;

import java.util.Comparator;

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.age, o2.age);
    }
}