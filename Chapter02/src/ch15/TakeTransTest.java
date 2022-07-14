package ch15;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentE = new Student("Edward", 20000);

        Taxi taxi = new Taxi("잘 나간다 운수");

        studentE.takeTaxi(taxi);
        studentE.showInfo();

        taxi.showTaxiInfo();
    }
}
