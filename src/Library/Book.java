package Library;

/**
 * Created by Elizaveta Naimark on 13.09.2016.
 */
public class Book implements Comparable<Book> {
    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return name.equals(book.name) && author.equals(book.author);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public int compareTo(Book o) {
        return author.compareTo(o.author);
    }
}
