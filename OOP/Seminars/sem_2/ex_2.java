package OOP.Seminars.sem_2;

public class ex_2 {

    public static void main(String[] args) {
        
    
    Obstacle[] obstacles = {
        new Track(1200),
        new Wall(3),
        new Track(2000),
        new Wall(2),
        new Track(3000),
        new Wall(4),
    };

    Runnable[] runnables = {
        new Robot("Rob", 5000, 3),
        new Human("Chel", 2500, 2),
        new Leon("Bars", 10000, 5)
    };

for (Runnable runnable : runnables) {
    for (Obstacle obstacle : obstacles) {
        if (obstacle instanceof Track) {
            if(!runnable.run(obstacle.getLength()))
            break;
        }

        else if (obstacle instanceof Wall) {
            if(!runnable.jump(obstacle.getHeight()))
            break;
        }
    }
}

    }
    
}
