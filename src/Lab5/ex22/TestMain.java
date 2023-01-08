package Lab5.ex22;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // A book written by 3 authors
        Author authors[] = new Author[3];
        authors[0] = new Author("An", "an@email.com", 'f');
        authors[1] = new Author("Binh", "binh@email.com", 'f');
        authors[2] = new Author("Tam", "tam@email.com", 'f');

        Book anotherJavaBook = new Book(" java", authors, 144.3, 10000);
        System.out.println(anotherJavaBook);

    }

}

