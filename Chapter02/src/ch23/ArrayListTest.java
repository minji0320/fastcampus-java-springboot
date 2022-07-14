package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // 처음 초기화 시 10개가 default
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태맥산맥1", "조정래"));
        library.add(new Book("태맥산맥2", "조정래"));
        library.add(new Book("태맥산맥3", "조정래"));
        library.add(new Book("태맥산맥4", "조정래"));
        library.add(new Book("태맥산맥5", "조정래"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
