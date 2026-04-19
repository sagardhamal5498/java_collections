package PrajwalPrograms.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class MainReadImpl {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Prajwal\\intellij_workspace\\gitproject\\java_collections\\src\\main\\java\\PrajwalPrograms\\serializationAndDeserialization\\Aa.ser");
            ObjectInputStream obj = new ObjectInputStream(fis);

            A a11 = (A) obj.readObject();

            System.out.println(a11.name);
            System.out.println(a11.salary);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
