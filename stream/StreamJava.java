package stream;

import java.io.FileReader;
import java.io.IOException;

public class StreamJava {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("stream/stream.txt");
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
