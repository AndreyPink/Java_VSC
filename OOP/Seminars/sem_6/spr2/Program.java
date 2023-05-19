package OOP.Seminars.sem_6.spr2;

public class Program {

    //TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        SaveToJson saveToJson = new SaveToJson(order);
        SaveToXML saveToXML = new SaveToXML(order);
        order.inputFromConsole();
        saveToJson.saveToJson();
        saveToXML.saveToXML();
    }

}
