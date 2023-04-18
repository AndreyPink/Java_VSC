package OOP.Seminars.sem_2;

public class Wall implements Obstacle {

    private int height;
    private int length;
    


    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return length;
    }

    
}