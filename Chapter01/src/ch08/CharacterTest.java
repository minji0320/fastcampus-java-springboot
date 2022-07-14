package ch08;

public class CharacterTest {

    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int) ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char) ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3);

        // char ch = -1;        음수 X
        // char ch = 1234567;   2 바이트 이상의 수 X

        char han = '한';
        char ch = '\uD55C';

        System.out.println(han);
        System.out.println(ch);
    }
}
