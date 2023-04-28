package OOP.Seminars.sem_5.presenters;

import java.util.Collection;

import OOP.Seminars.sem_5.models.Table;

public interface Model {
    
    Collection<Table> loadTables();
}
