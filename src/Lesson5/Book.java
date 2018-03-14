package Lesson5;
/*Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные
  на консоль. В каждом классе, обладающем информацией должно быть объявлено несколько конструкторов.

  Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
        Создать массив объектов. Вывести:
            a) список книг заданного автора;
            b) список книг, выпущенных заданным издательством;
            c) список книг, выпущенных после заданного года.
*/

public class Book {
    private static int id =1;
    private String bookName;
    private String[] author;
    private String publishing;
    private  int yearOfBuilding;
    private  int numberOfPages;
    private  double price;
    private String typeOfBinding;

    public Book( String bookName, String[] author, String publishing, int yearOfBuilding, //создаем конструктор
                int numberOfPages, double price, String typeOfBinding){                   //для новой книги
        this.id +=id;
        this.bookName = bookName;
        this.author = author;
        this.publishing = publishing;
        this.yearOfBuilding = yearOfBuilding;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }
        //создаем для каждого поля сетеры и гетеры
    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        String[]author = this.author; //авторов заносим в массив
        String joinedAutor = String.join(", ", author);// заносм авторов в список и указывая как их отделять
        return joinedAutor;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearOfBuilding() {
        return yearOfBuilding;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public String toString(){ //метод выведет нам полное описаные вызваной книги
        return "Book" + this.id + ";\n" + "Название книги: " + this.bookName + "\nАвтор: "  + this.author + "\nИздательство: "
                + this.publishing + "\nГод издания: " +  this.yearOfBuilding + "\nКоличество страниц: " + this.numberOfPages
                + "\nЦена: " + this.price + "\nТип переплета: " + this.typeOfBinding;
    }

    public static void main(String[] args) {
        //создадим немного книг через созданый конструктор
        Book b1 = new Book("book1", new String[]{"Jon"}, "publ1",2000,
                1800,150.0, "soft");
        Book b2 = new Book("book2", new String[]{"Stive"}, "publ2",2001,
                1500,130.0, "solid");
        Book b3 = new Book("book3", new String[]{"Stiv"}, "publ1",2002,
                1200,120.0, "soft");
        Book b4 = new Book("book4", new String[]{"Jon"}, "publ2",2003,
                1350,125.50, "solid");
        Book b5 = new Book("book5", new String[]{"Stiv"}, "publ1",2004,
                1600,132.50, "soft");

        Library lib = new Library(); //создаем обьект класса Library
        lib.addBook(b1);
        lib.addBook(b2);            //заносим значения книг в новые обьекты
        lib.addBook(b3);
        lib.addBook(b4);
        lib.addBook(b5);


    }
}
