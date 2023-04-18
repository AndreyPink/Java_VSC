package OOP.Seminars.sem_2;

public class ex_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars", "red");
        Dog dog1 = new Dog("Dog", 10);
        cat1.jump();
        cat1.voice();
        dog1.jump();
        dog1.voice();

        Animal cat2 = new Cat("Pers", "black");
        cat2.jump();
        cat2.voice();
        System.out.println(cat2.getName());

        CatV2 cat3 = new CatV2("Bug");
        Bird bird1 = new Bird("Polly");
        cat3.swim(3);
        bird1.fly(10);
        
        Object[] animals = new Object[] {cat1, cat2, dog1};

        for (Object animal : animals) {
            System.out.println(((Animal) animal).getName());
            
        }

    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void jump() {
        System.out.println("animal jumping");
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();



}

class Dog extends Animal {
    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Dog jumping");
    }

    @Override
    public void voice() {
        System.out.println("Dog barking");

    }

    public void getWeight() {
        System.out.println(weight);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public void voice() {
        System.out.println("Cat meows");

    }

    public void getColor() {
        System.out.println(color);
    }
}

interface Runnable{

    void swim (int distance);
    void run (int distance);
}

interface Flyable{
    
    void fly (int distance);

}

class CatV2 implements Runnable{

    private String name;

    public CatV2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim(int distance) {
       System.out.println("swim " + distance);
    }

    @Override
    public void run(int distance) {
        System.out.println("run " + distance);
    }

}

class DogV2 implements Runnable{

    private String name;

    public DogV2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim(int distance) {
        System.out.println("swim " + distance);
    }

    @Override
    public void run(int distance) {
        System.out.println("run " + distance);
    }

}

class Bird implements Flyable, Runnable{

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim(int distance) {
        System.out.println("swim " + distance);
    }

    @Override
    public void run(int distance) {
        System.out.println("run " + distance);
    }

    @Override
    public void fly(int distance) {
        System.out.println("fly " + distance);
    }

}