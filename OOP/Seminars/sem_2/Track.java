package OOP.Seminars.sem_2;

public class Track implements Obstacle {

private int length;
private int height = 0;



public Track(int length) {
    this.length = length;
}

@Override
public int getLength() {
    return length;
}

@Override
public int getHeight() {
    return height;
}

}