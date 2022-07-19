package ch16;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10];

            // offset 1, 9개만 읽기
            while ((i = fis.read(bs, 1, 9)) != -1) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bs[j]);
                }
                System.out.println(" : " + i + "바이트 읽음");
                // ABCDEFGHIJ : 10바이트 읽음
                // KLMNOPQRST : 10바이트 읽음
                // UVWXYZQRST : 6바이트 읽음
                // 이전에 읽은 값이 남아 있기 때문에.. -> 읽은 개수만큼 출력하기

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
