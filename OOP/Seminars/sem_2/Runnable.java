package OOP.Seminars.sem_2;

public interface Runnable {

/**
 * Jump
 * @param height jump
 * @return result (yes/no)
 */    
boolean jump(int height);

/**
 * Run
 * @param length run
 * @return result (yes/no)
 */
boolean run(int length);

/**
 * Get Name 
 * @return name
 */
String getName();

/**
 * 
 * @return Max run distance
 */
int getMaxRun();

/**
 * 
 * @return Max run height
 */
int getMaxJump();

}