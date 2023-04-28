package OOP.Seminars.sem_5;

import java.util.Date;

import OOP.Seminars.sem_5.models.TableModel;
import OOP.Seminars.sem_5.presenters.BookingPresenter;
import OOP.Seminars.sem_5.views.BookingView;

public class ex_1 { /**
    * TODO: ДОМАШНЯЯ РАБОТА
    * Метод changeReservationTable должен ЗАРАБОТАТЬ!
    *
    * @param args аргументы командной строки
    */
   public static void main(String[] args) {
       TableModel tableModel = new TableModel();
       BookingView bookingView = new BookingView();
       BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
       bookingPresenter.loadTables();
       bookingPresenter.updateView();

       bookingView.reservationTable(new Date(), 3, "Станислав");

       bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
   }

}
