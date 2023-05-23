package OOP.Seminars.sem_7.observer;

public interface CreateVacancy {

    public default Vacancy createVacancy(){
         return new Vacancy();
    }
    
}
