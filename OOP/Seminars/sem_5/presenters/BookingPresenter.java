package OOP.Seminars.sem_5.presenters;

import java.util.Collection;
import java.util.Date;

import OOP.Seminars.sem_5.models.Table;

public class BookingPresenter implements ViewObserver{

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }

    public void updateView(){
        view.showTables(tables);
    }

    private void updateReservationStatusView(int reservationNo){
        view.showReservationStatus(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(orderDate, tableNo, name);
        updateReservationStatusView(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateReservationStatusView(reservationNo);

    }

    @Override
    public void deleteReservation(int oldReservation) {
    model.deleteReservation(oldReservation);
    }
}
