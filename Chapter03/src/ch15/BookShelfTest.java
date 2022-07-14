package ch15;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enqueue("토지1");
        bookQueue.enqueue("토지2");
        bookQueue.enqueue("토지3");
        bookQueue.enqueue("토지4");
        bookQueue.enqueue("토지5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());
    }
}
