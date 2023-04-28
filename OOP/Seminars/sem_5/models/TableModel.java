package OOP.Seminars.sem_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Lectures.program;
import OOP.Seminars.sem_5.presenters.Model;

public class TableModel implements Model{

    private Collection<Table> tables;
    
    public Collection<Table> loadTables(){
    
    if(tables == null){
    tables = new ArrayList<>();

    tables.add(new Table());
    tables.add(new Table());
    tables.add(new Table());
    tables.add(new Table());
    tables.add(new Table());
    }
return tables;
    }

    public int reservationTable(Date reservationData, int tableNo, String name){
        for (Table table : loadTables()) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationData, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
    }
}
