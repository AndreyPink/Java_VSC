package OOP.Seminars.sem_5.views;

import java.util.Collection;

import javax.xml.crypto.Data;

import OOP.Seminars.sem_5.models.Table;
import OOP.Seminars.sem_5.presenters.View;
import OOP.Seminars.sem_5.presenters.ViewObserver;

public class BookingView implements View{

    private ViewObserver observer;
    
    public void showTables(Collection<Table> tables){

        for (Table table: tables){
            System.out.println(table);
        }
    }

    public void reservationTable(Data orderData, int tableNo, String name){
    observer.onReservationTable(orderData, tableNo, name);


    }
}
