package Seminars.sem_6;

public class cat {
    public String name;
    public Integer age;
    public String kind;
    public Integer size;
    public Integer weight;
    public Integer healthyLevel;
    public String gender;
    public boolean vaccinated = false;

@Override
public String toString() {
    return ("Name: " + this.name + "; Age: " + this.age + "; Weight: " + this.weight + "; Vaccinated: " + this.vaccinated);
}

    public void changeAge() {
        this.age += 1;
    }

    public void changeWeight() {
        this.weight += 1;
    }

    public void doVaccinated() {
        this.vaccinated = true;
    }
}

