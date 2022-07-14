package ch08;

public class Order {
    String orderId;
    String phoneNumber;
    String address;
    String orderDate;
    String orderTime;
    int price;
    String menuNumber;

    public Order(String orderId, String phoneNumber, String address, String orderDate, String orderTime, int price, String menuNumber) {
        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showOrderInfo() {
        System.out.println("주문 접수 번호 : " + orderId + "\n" +
                "주문 핸드폰 번호 : " + phoneNumber + "\n" +
                "주문 집 주소 : " + address + "\n" +
                "주문 날짜 : " + orderDate + "\n" +
                "주문 시간 : " + orderTime + "\n" +
                "주문 가격 : " + price + "\n" +
                "메뉴 번호 : " + menuNumber);
    }
}
