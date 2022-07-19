package ch15;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

    public static void main(String[] args) {

        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        int i;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            // System.in.read()의 반환값은 int, 한 바이트씩 읽음
            while ((i = isr.read()) != '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
