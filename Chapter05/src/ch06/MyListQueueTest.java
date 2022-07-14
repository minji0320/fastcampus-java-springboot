package ch06;

public class MyListQueueTest {

    public static void main(String[] args) {

        MyLinkedQueue listQueue = new MyLinkedQueue();
        listQueue.enqueue("A");
        listQueue.enqueue("B");
        listQueue.enqueue("C");

        listQueue.printQueue();

        System.out.println(listQueue.dequeue());
        System.out.println(listQueue.dequeue());
    }
}
