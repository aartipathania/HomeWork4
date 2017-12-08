package Homework4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileBufferedReader {
    public static void main(String[] args) {
        File path = new File("Hello.txt");
        FileReader read = null;
        BufferedReader buffer = null;

        try {
            read = new FileReader(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        buffer = new BufferedReader(read);
        String text;

        try {
            while ((text = buffer.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e1){
                e1.printStackTrace();
            }finally {
            try{
                buffer.close();
                read.close();
            }catch(IOException e2){
                e2.printStackTrace();
            }
        }
    }
}
