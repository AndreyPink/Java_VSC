package OOP.Seminars.sem_4;

import java.util.Arrays;

public class ex_1 {

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(5, 1000.15);
        int simpleAccountId = simpleAccount.getId();
        System.out.println(simpleAccount);

        UniversalAccount universalAccount1 = new UniversalAccount("AA11BB", 1100.15);
        System.out.println(universalAccount1);
        UniversalAccount universalAccount2 = new UniversalAccount(5001, 1100.15);
        System.out.println(universalAccount2);
        UniversalAccount universalAccount3 = new UniversalAccount(new CustomAccountIdentifier(123, "BB"), 1100.15);
        System.out.println(universalAccount3);

        CustomAccountIdentifier identifier = (CustomAccountIdentifier) universalAccount3.getId();

        Account<Integer> account1 = new Account<>(5001, 1100.15);
        System.out.println(account1);
        int account1Id = account1.getId();

        Account<CustomAccountIdentifier> account2 = new Account<>(identifier, 1000);
        System.out.println(account2);

        Integer[] numbers = {2,4,5,6,6,7,7,8};
        Object[] numbersNew =  ArrayUtils.replaceTwoElements(numbers, 1, 2);
        System.out.println(Arrays.toString(numbersNew));

        String[] str = {"q", "w", "e"};
        String[] strNew = ArrayUtils.replaceTwoElementsV2(str, 1, 2);
        System.out.println(Arrays.toString(strNew));
    }
}

class ArrayUtils {
    public static Object[] replaceTwoElements(Object[] array, int index1, int index2) {
        Object[] newArray =  array.clone();
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            return null;
        Object obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }

    public static <T> T[] replaceTwoElementsV2(T[] array, int index1, int index2) {
        T[] newArray =  array.clone();
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            return null;
        T obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }

}

class Account<T> {
    private final T id;
    private double amount;

    public Account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return String.format("Сумма средств на счете %s:  %f", id, amount);
    }

}

class UniversalAccount {
    private final Object id;
    private double amount;

    public UniversalAccount(Object id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return String.format("Сумма средств на счете #%s:  %f", id, amount);
    }

    public Object getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

}

class CustomAccountIdentifier {
    private int id;
    private String prefix;

    public CustomAccountIdentifier(int id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}

class SimpleAccount {
    private final int id;
    private double amount;

    public SimpleAccount(int id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return String.format("Сумма средств на счете %s:  %f", id, amount);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

}
