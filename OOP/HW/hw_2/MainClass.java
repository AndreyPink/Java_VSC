package OOP.HW.hw_2;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random rand = new Random();

        Cat cat1 = new Cat("Cat1", rand.nextInt(10, 20));
        Cat cat2 = new Cat("Cat2", rand.nextInt(10, 20));
        Cat cat3 = new Cat("Cat3", rand.nextInt(10, 20));
        Cat cat4 = new Cat("Cat4", rand.nextInt(10, 20));
        Cat cat5 = new Cat("Cat5", rand.nextInt(10, 20));

        Plate plate = new Plate(rand.nextInt(50, 100));
        
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
        System.out.print("Start ");
        plate.info();
        for (Cat cat : cats) {
            if (plate.getFood() > cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("%s eating %d foods\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.info();
            }
            else if (rand.nextBoolean()){
                plate.addFood(cat.getAppetite() - plate.getFood());
                System.out.printf("%s eating %d foods\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }
            
        }
        System.out.println("---------------------------");
        for (Cat cat : cats) {
            System.out.printf("%s satiety is %b\n", cat.getName(), cat.isSatiety());
        }
    }
}
