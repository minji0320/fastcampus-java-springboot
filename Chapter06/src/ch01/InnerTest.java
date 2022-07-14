package ch01;

class OutClass {

    private int num = 0;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {

        int iNum = 100;

        // 내부 클래스에서는 정적 변수를 사용할 수 없음
        // static int sInNum = 500;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            // 외부 클래스의 인스턴스 변수는 사용 불가능
            // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }

        static void sTest() {
            // 외부 클래스의 인스턴스 변수는 사용 불가능
            // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");

            // 내부의 인스턴스 변수도 사용 불가능
            // System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {

//        OutClass outClass = new OutClass();
//        outClass.usingClass();
//
//        OutClass.InClass inner = outClass.new InClass();
//        inner.inTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        OutClass.InStaticClass.sTest();
    }
}