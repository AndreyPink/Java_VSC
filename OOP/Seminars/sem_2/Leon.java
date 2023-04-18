package OOP.Seminars.sem_2;

public class Leon implements Runner{

    private String name;
    private int maxRun;
    private int maxJump;
    

    public Leon(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean jump(int distance) {
        return false;
    }

    @Override
    public boolean run(int distance) {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    
}