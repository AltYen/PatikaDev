package Collections.BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
        book.add(new Book("Hatred Of The Sea", 152,"Hacı","2000"));
        book.add(new Book("Accepting The Swamp", 321,"Veli","2002"));
        book.add(new Book("Drinking At The Angels", 945,"Hüseyin","2008"));
        book.add(new Book("Rats Of Yesterday", 361,"Ayşe","2016"));
        book.add(new Book("Thieves And Lions", 745,"Fatma","2020"));

        System.out.println("----------------------");
        System.out.println("ORDER BY bookName ASC");
        System.out.println("----------------------");
        for (Book b: book){
            System.out.println("Book Name : " +b.getBookName());
        }
        System.out.println("----------------------");

        TreeSet<Book> book2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount()-o2.getPageCount();
            }
        });

        book2.addAll(book);

        System.out.println();
        System.out.println("----------------------");
        System.out.println("ORDER BY pageCount ASC");
        System.out.println("----------------------");
        for (Book b: book2){
            String bookName = b.getBookName();
            int pageCount = b.getPageCount();
            System.out.printf("Book Name : %-25s | Page Count : %4d%n", bookName, pageCount);
        }
        System.out.println("----------------------");
    }
}
