package OOP.Seminars.sem_5;

import OOP.Seminars.sem_5.models.TableModel;
import OOP.Seminars.sem_5.presenters.BookingPresenter;
import OOP.Seminars.sem_5.views.BookingView;

public class ex_1 {
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();
    }
}

