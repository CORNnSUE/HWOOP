package ex21;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author Nghia = new Author("Nghia", "nghia@hus.edu.vn", 'm');
        System.out.println(Nghia);

        Nghia.setEmail("nghia@gmail.com");
        System.out.println(Nghia);

        Book aBook = new Book("Java", Nghia, 10.43, 1000);
        System.out.println(aBook);
        System.out.println("Name is:" + aBook.getName());
        System.out.println("Price is:" + aBook.getPrice());
        System.out.println("Qty is:" + aBook.getQty());
        System.out.println("Author is:" + aBook.getAuthor());
        System.out.println("Author's name:" + aBook.getAuthor().getName());
        System.out.println("Author's email:" + aBook.getAuthor().getEmail());
        Book anotherBook = new Book("More Java", new Author("Paul", "paul@gmail.com", 'm'), 29 );
        System.out.println(anotherBook);



    }

}

