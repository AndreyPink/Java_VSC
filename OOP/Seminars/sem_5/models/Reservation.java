package OOP.Seminars.sem_5.models;

import java.util.Date;

import javax.xml.crypto.Data;

public class Reservation {
    
    private static int counter;
    private final int id;
    private Data data;
    private String name;

    public Reservation(Date reservationData, String name) {
        this.data = reservationData;
        this.name = name;
    }

    {
        id = ++ counter;
    }

    public Data getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
