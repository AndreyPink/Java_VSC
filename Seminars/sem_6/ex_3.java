package Seminars.sem_6;

public class ex_3 {
    public static void main(String[] args) {
        cat c1 = new cat(); 
        c1.age = 3;
        c1.name = "Jow";
        c1.gender = "man";
        c1.healthyLevel = 9;
        c1.kind = "sphinx";
        c1.size = 3;
        c1.weight = 1;
        
        System.out.println(c1);
        c1.changeAge();
        c1.changeWeight();
        c1.doVaccinated();
        System.out.println(c1);

        CatNew c2 = new CatNew("Frosya", 2, 3); 
        
        System.out.println(c2);
        c2.setAge(3);
        c2.setName("Filya");
        c2.doVaccinated();
        System.out.println(c2);


    }

}
