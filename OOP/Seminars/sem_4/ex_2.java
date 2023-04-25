package OOP.Seminars.sem_4;

public class ex_2 {
    public static void main(String[] args) {

        DebitAccount<Entity> entityDebitAccount1 = new DebitAccount<>(new Entity("Luna", "123"), 4200);
        CreditAccount<Person> personCreditAccount1 = new CreditAccount<>(new Person("Andrey", "Ivanov", "123"), 100);

        Transaction<Account<?>> transaction1 = new Transaction<>(entityDebitAccount1, personCreditAccount1, 100.1);
        transaction1.execute();

    }
}

class Transaction<T extends Account<? extends PersonalData>> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() > amount) {
            System.out.printf("осуществлен перевод между счетами на сумму %.2f руб \n", amount);
            System.out.printf("счет списания: #%s: %.2f руб \n счет зачисления: #%s: %.2f руб \n", from.getData(),
                    from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println("текущее состояние счетов: ");
            System.out.println(from);
            System.out.println(to);

        } else {
            System.out.println("операция невозможна, недостаточно средств");
        }
    }
}

class CreditAccount<T extends PersonalData> extends Account<T> {

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}

class DebitAccount<T extends PersonalData> extends Account<T> {

    public DebitAccount(T data, double amount) {
        super(data, amount);
    }
}

abstract class Account<T extends PersonalData> {

    private double amount;
    private final T data;

    public Account(T data, double amount) {
        this.amount = amount;
        this.data = data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("%s; %.2f руб.", data, amount);
    }

}

interface PersonalData {

    String getINN();

}

class Person implements PersonalData {

    private final String firstName;
    private final String lastName;
    private final String inn;

    public Person(String firstName, String lastName, String inn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s %s;", inn, lastName, firstName);
    }

    @Override
    public String getINN() {
        return inn;
    }
}

class Entity implements PersonalData {

    private final String name;
    private final String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s;", inn, name);
    }

    @Override
    public String getINN() {
        return inn;
    }

}