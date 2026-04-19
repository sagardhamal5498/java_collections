package PrajwalPrograms.serializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainImpl {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Prajwal\\intellij_workspace\\gitproject\\java_collections\\src\\main\\java\\PrajwalPrograms\\serializationAndDeserialization\\Aa.ser");

            ObjectOutputStream obj = new ObjectOutputStream(fos);

            A a1=new A();

            obj.writeObject(a1);

            fos.close();
            obj.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
