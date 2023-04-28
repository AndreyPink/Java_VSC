package OOP.Seminars.sem_5;

import java.util.Date;
import java.util.Scanner;

import OOP.Seminars.sem_5.models.TableModel;
import OOP.Seminars.sem_5.presenters.BookingPresenter;
import OOP.Seminars.sem_5.views.BookingView;

public class Program {

    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();

        while (true) {

            System.out.println("\nВыберете действие: ");
            System.out.println("1. Просмотреть список свободных столов");
            System.out.println("2. Забронировать столик");
            System.out.println("3. Изменить бронирование стола");
            System.out.println("4. Отменить бронирование стола");
            System.out.println("5. Завершить бронирование");

            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();

            int tableNum;
            String clientName;
            int res;

            switch (action) {
                case 1:
                bookingPresenter.updateView();
                    break;

                case 2:
                System.out.println("\nВведите номер свободного столика:");
                tableNum = sc.nextInt();
                System.out.println("Введите ваше Имя:");
                clientName = sc.next();
                bookingView.reservationTable(new Date(), tableNum, clientName);
                    break;

                case 3:
                System.out.println("\nВведите номер резервации:");
                res = sc.nextInt();
                System.out.println("Введите номер свободного столика:");
                tableNum = sc.nextInt();
                System.out.println("Введите ваше Имя:");
                clientName = sc.next();
                bookingView.changeReservationTable(res, new Date(), tableNum, clientName);
                    break;

                case 4:
                System.out.println("\nВведите номер резервации:");
                res = sc.nextInt();
                bookingView.deleteReservation(res);
                    break;

                case 5:
                sc.close();
                    return;

                default:
                sc.close();
                    break;

                    
            }

        }

    }


}
