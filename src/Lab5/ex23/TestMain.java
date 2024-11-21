package Lab5.ex23;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Author Nghia = new Author("Nghia", "nghia@gmail.com");
        System.out.println(Nghia);

        Nghia.setEmail("nghia@gmail.com");
        System.out.println(Nghia.getEmail() );

        Book javaBook = new Book("1234", " java", Nghia, 18.5, 1000);
        System.out.println(javaBook);

        javaBook.setPrice(100);
        javaBook.setQty(2002);

        System.out.println("Author name: " +javaBook.getAuthorName());
        System.out.println("isbn is" + javaBook.getIsBn());
        System.out.println("Book name is:" + javaBook.getName());

        System.out.println("Price is: "+ javaBook.getPrice());
        System.out.println("Qty is: " + javaBook.getQty());
        System.out.println("Author is: " + javaBook.getAuthor());
        System.out.println("Author's name: " + javaBook.getAuthor().getName());
        System.out.println("Author's email: " + javaBook.getAuthor().getEmail());

    }

}

