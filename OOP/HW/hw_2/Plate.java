package OOP.HW.hw_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.printf("plate: %d\n\n",food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void addFood(int add) {
        this.food += add;
        System.out.printf("!!!Add %d foods\n\n", add);
    }
}
