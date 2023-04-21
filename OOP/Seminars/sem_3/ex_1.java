package OOP.Seminars.sem_3;

public class ex_1 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1", 10);
        Dog dog1 = new Dog("Dog1", 20, 30);
        Animal animal1 = new Animal("Animal1", 30, 20);
        Animal animal2 = new Animal("Animal2", 25, 35);

        System.out.printf("Общее кол-во животных: %d\n", Animal.getCounter());
        System.out.printf("Общее кол-во котов: %d\n", Cat.getCounter());
        System.out.printf("Общее кол-во собак: %d\n", Dog.getCounter());

    }
}

/**
 * Animal
 */
class Animal {

    protected String name;
    private int maxRun;
    private int maxSwim;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else
            System.out.printf(" не смог %s пробежать %d метров\n", name, distance);
    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else
            System.out.printf(" не смог %s проплыть %d метров\n", name, distance);
    }
}

class Dog extends Animal {

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

}

class Cat extends Animal {

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    public Cat(String name, int maxRun) {
        super(name, maxRun, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать\n", name);
    }
}