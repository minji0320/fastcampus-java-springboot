package ch18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        // FileInputStream 을 사용하면 한글이 깨짐
        try (FileReader fr = new FileReader("reader.txt")) {
            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
