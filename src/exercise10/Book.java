package exercise10;

/**
 * Class Book
 * @author rublan01
 */
public class Book {
    final String title = "";
    final String author = "";
    Double price;
    final Integer year = 0;
}


class ByTitle implements Comparator<Book> {
}

class ByAuthor implements Comparator<Book> {
}

class ByPrice implements Comparator<Book> {
}

class ByYear implements Comparator<Book> {
}
