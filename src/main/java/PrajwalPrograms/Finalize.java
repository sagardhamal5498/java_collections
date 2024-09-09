package PrajwalPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class Finalize {

    public static void main(String[] args) {

        try(BufferedReader br= new BufferedReader(new FileReader(
               "C:\\Users\\Prajwal\\OneDrive\\Desktop\\deeesktop\\java programs practise\\FileHandlings\\newf2.txt"
        ))){

//            System.out.println(br.lines().count());

            String ss= br.readLine();
            while((ss=br.readLine())!=null){
                System.out.println(ss);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
