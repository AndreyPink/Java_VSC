// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package Seminars.sem_3;

import java.util.ArrayList;
import java.util.Random;

public class ex_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> planets = new ArrayList<>();
        String[] currentPlanets = { "Mercury", "Venera", "Saturn", "Uran",
                "Neptun", "Earth", "Jupiter" };

        for (int i = 0; i < 10; i++) {
            planets.add(currentPlanets[random.nextInt(currentPlanets.length - 1)]);
        }
        System.out.println(planets);
        int count = 1;
        planets.sort(null);
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i) == planets.get(i - 1)) {
                count += 1;
            } else {
                System.out.println(planets.get(i - 1) + " " + count);
                count = 1;
            }
        }
        System.out.println(planets.get(planets.size() - 1) + " " + count);
    }
}
