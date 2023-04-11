package Seminars.sem_6;

public class CatNew {
    private String name;
    private Integer age;
    private Integer weight;
    private boolean vaccinated = false;

// конструктор
public CatNew(String name, Integer age, Integer weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
}

//геттеры
public String getName() {
    return name;
}

public Integer getAge() {
    return age;
}

//сеттеры
public void setName(String name) {
    this.name = name;
}
public void setAge(Integer age) {
    this.age = age;
}

//переназначение стринга
@Override
public String toString() {
    return ("Name: " + this.name + "; Age: " + this.age + "; Weight: " + this.weight + "; Vaccinated: " + this.vaccinated);
}

//методы
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
