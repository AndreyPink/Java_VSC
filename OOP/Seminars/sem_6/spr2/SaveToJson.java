package OOP.Seminars.sem_6.spr2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    Order saveOrder;
    
    public SaveToJson(Order saveOrder) {
        this.saveOrder = saveOrder;
    }

    public void saveToJson() {
        String fileName = "OOP/Seminars/sem_6/spr2/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ saveOrder.getClientName() + "\",\n");
            writer.write("\"product\":\""+saveOrder.getProduct()+"\",\n");
            writer.write("\"qnt\":"+saveOrder.getQnt()+",\n");
            writer.write("\"price\":"+saveOrder.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
