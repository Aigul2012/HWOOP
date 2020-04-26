package FridayPractice;

public class Main {
    public static void main(String[] args) {
        BookShop bookShop1 = new BookShop();
        MyProduct book1 = new MyProduct("The best book", 200d, 150, 3);
        MyProduct book2 = new MyProduct("Green book", 150d, 256, 5);
        MyProduct book3 = new MyProduct("Saturday Night", 133d, 120, 4);
        MyProduct book4 = new MyProduct("Mary Jane", 245d, 1050, 2 );

        System.out.println("Книги в наличии: ");
        bookShop1.add(book1);
        bookShop1.add(book2);
        bookShop1.add(book3);
        bookShop1.add(book4);
        bookShop1.printAllProducts();

        bookShop1.sell(book1);
        bookShop1.sell(book2);
        System.out.println("Оставшиеся книги: ");
        bookShop1.printAllProducts();

    }







}
