package OOP.Seminars.sem_5.presenters;

import java.util.Collection;
import java.util.Date;

import Lectures.program;
import OOP.Seminars.sem_5.models.Table;
import OOP.Seminars.sem_5.models.TableModel;

public class BookingPresenter implements ViewObserver{

    private final Model model;
    private final View view;

    private Collection<Table> tables;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    public void loadTables(){
        if (tables == null) {
            tables = model.loadTables();
        }
    }

    public void updateView(){
        this.view.showTables(tables);
    }

    private void updateReservationStatusView(int reservationNo){

    }

    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo =  model.reservationTable(orderDate, tableNo, name);
   updateReservationStatusView(reservationNo);
    }
}
