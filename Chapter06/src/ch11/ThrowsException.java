package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "abc");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            // 이는 가장 아래에 위치시켜야 함
            System.out.println("default exception");
        }

        System.out.println("end");
    }
}
