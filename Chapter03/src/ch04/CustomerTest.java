package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(12345,"noname");  // 접근은 상위 클래스의 멤버변수, 메서드만 가능
        vc.calcPrice(1000);
        System.out.println(vc.showCustomerInfo() + price);  // 실제 인스턴스의 메서드가 호출됨
    }
}
