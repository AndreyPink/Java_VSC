package OOP.HW.hw_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ex_1_ {

public static Random rand = new Random();

public static ArrayList<Apple> fillTheAppleBox(int amount) {
    ArrayList<Apple> appleList = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
        appleList.add(new Apple());
    }
    return appleList;
}

public static ArrayList<Orange> fillTheOrangeBox(int amount) {
    ArrayList<Orange> orangeList = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
        orangeList.add(new Orange());
    }
    return orangeList;
}

public static void boxCompare(Box<?> b1, Box<?> b2){
    System.out.printf("\nСравниваем вес коробок №%d-'%s' и №%d-'%s': ", b1.getId(), b1.getName(), b2.getId(), b2.getName());
    if(b1.compareTo(b2))
    System.out.println("вес коробок одинаковый");
    else System.out.println("вес коробок разный");
}


public static void shiftBox(Box b1, Box b2){
    System.out.printf("\nПересыпаем фрукты из коробки №%d в №%d:\n", b1.getId(), b2.getId());
    if ((b1.name.equals(b2.name) || b2.name.equals("пусто")) && b1.fruits.size() > 0) {
    
            for (int i = b1.fruits.size()-1; i > 0; i--) {
                b2.fruits.add(b1.fruits.get(0));
                b1.fruits.remove(i);
            }
            b2.fruits.add(b1.fruits.get(0));
            b1.fruits.remove(0);

    System.out.printf("Коробка №%d опустела, вес коробки №%d - %.2f кг\n\n", b1.getId(), b2.getId(), b2.getWeight());
    b1.setWeight(0);
    b2.name = b1.name;
    b1.name = "пусто";
    b2.setWeight(b2.getWeight());
    }
    else System.out.println("Это коробки с разными фруктами или первая коробка пустая, пересыпать нельзя\n");
}

    public static void main(String[] args) {

Box<Apple> box1 = new Box<Apple>(fillTheAppleBox(15));
Box<Apple> box2 = new Box<Apple>(fillTheAppleBox(26));
Box<Orange> box3 = new Box<Orange>(fillTheOrangeBox(14));
Box<Orange> box4 = new Box<Orange>(fillTheOrangeBox(10));

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);

boxCompare(box1, box4);
boxCompare(box2, box3);

shiftBox(box1, box2);
shiftBox(box3, box4);

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);

shiftBox(box2, box1);

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);

shiftBox(box1, box3);

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);


    }

}

abstract class Fruit {
    private final float weight;
    private final String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    

}

class Apple extends Fruit {

    public Apple() {
        super(1.0f, "Яблоки");
    }

}

class Orange extends Fruit {

    public Orange() {
        super(1.5f, "Апельсины");

    }

}

class Box<T extends Fruit> {

    private static final AtomicInteger counter = new AtomicInteger(1);
    ArrayList<T> fruits;
    String name;
    int id;
    float weight;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        if(fruits.isEmpty())
            this.name = "пусто";
        else
            this.name = fruits.get(0).getName();
        this.id = counter.getAndIncrement();
        this.weight = getWeight();
    }

    public float getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compareTo(Box<?> box) {
        return true ? Float.compare(getWeight(), box.getWeight()) == 0 : false;
    }

    @Override
    public String toString() {

        return "Коробка №" + id + "; Фрукты: " + name + "; вес: " + weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}

