package ch19;

public class CarFactory {

    private static int serialNum = 1000;
    private static CarFactory instance = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar() {
        return new Car(++serialNum);
    }
}
