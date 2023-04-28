package OOP.Seminars.sem_5.presenters;

public interface ViewObserver {
    
    void onReservationTable(Data orderDate, int tableNo, String name);
}
