package Lesson5;
import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void AllBooks() {
        books.forEach(book -> System.out.println(book));
    }

    public void addBook(Book b) {  //метод заност книги в колекцию
        books.add(b);
    }
        /*
        Теперь нам надо вывести книг по автору для этого мы нашу колекцию фильтруем по автору через filter() затем делаем
        новую колекцию из книг по автору и перечисляем их через
         */
    public List<Book> getAuthorBooks(String author) { //метод вывда книг по автору
            List<Book> filter = books.stream().filter(b -> b.getAuthor().contains(author)).collect(Collectors.toList());
        filter.forEach(book -> System.out.println(book));
        return filter;
    }


    public List<Book> getPublishingBooks(String publishing) {
        List<Book> filter = books.stream().filter(b -> b.getPublishing().contains(publishing)).collect(Collectors.toList());
        filter.forEach(book -> System.out.println(book));
        return filter;
    }

    public List<Book> getYearBooks(int year) {
        List<Book> filter = books.stream().filter(b -> b.getYearOfBuilding() >year ). collect(Collectors.toList());
        filter.forEach(book -> System.out.println(book));
        return filter;
    }
}
